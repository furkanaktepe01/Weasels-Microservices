package com.weasels.portal.api.actions.shared;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import org.springframework.http.HttpStatus;
import org.springframework.web.client.HttpClientErrorException;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class HelperMethods {

	public static void validateActionIdForOperation(String actionId, String ActionDtoSimpleName, String operation) {

		String actionIdName = ActionDtoSimpleName.replace("DTO", "")
				.replaceFirst(String.valueOf(ActionDtoSimpleName.charAt(0)),
						String.valueOf(ActionDtoSimpleName.charAt(0)).toLowerCase())
				.concat("Id");

		if (actionId != null && operation.equals("create")) {

			throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
					String.format("Could not create: %s:<%s> must be null.", actionIdName, actionId));
		}

		if (actionId == null && operation.equals("update")) {

			throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
					String.format("Could not update: %s:<%s> cannot be null.", actionIdName, actionId));
		}
	}

	public static <ActionEntity> ExampleMatcher ignoreNullPathsExampleMatcher(ActionEntity actionEntity) {

		HashMap<String, Object> actionEntityHashMap = new ObjectMapper().convertValue(actionEntity,
				new TypeReference<HashMap<String, Object>>() {
				});

		List<String> nullProperties = new ArrayList<>(actionEntityHashMap.keySet()).stream()
				.filter(prop -> actionEntityHashMap.get(prop) == null
						|| actionEntityHashMap.get(prop).equals(Integer.valueOf(Integer.MIN_VALUE))
						|| prop.equals("id"))
				.collect(Collectors.toList());

		ExampleMatcher exampleMatcher = ExampleMatcher.matching().withIgnoreNullValues()
				.withIgnorePaths(nullProperties.toArray(new String[nullProperties.size()]));

		return exampleMatcher;
	}

	public static <actionDetailsType> String getActionIdFromActionDetails(String ActionDtoSimpleName,
			actionDetailsType actionDetails) {

		String actionName = ActionDtoSimpleName.replace("DTO", "");

		ExpressionParser parser = new SpelExpressionParser();

		EvaluationContext context = new StandardEvaluationContext(actionDetails);

		Expression exp = parser.parseExpression(String.format("get%sId()", actionName));

		String actionId = exp.getValue(context, String.class);

		return actionId;
	}

	public static <ActionDTO> void setActionIdOfActionDetails(String ActionDtoSimpleName, ActionDTO actionDetails) {

		String actionName = ActionDtoSimpleName.replace("DTO", "");

		ExpressionParser parser = new SpelExpressionParser();

		EvaluationContext context = new StandardEvaluationContext(actionDetails);

		context.setVariable("randomId", UUID.randomUUID().toString());

		Expression exp = parser.parseExpression(String.format("set%sId(#randomId)", actionName));

		exp.getValue(context);
	}

	public static <ActionDTO> void setActionDateOfActionDetails(String ActionDtoSimpleName, ActionDTO actionDetails) {

		String actionName = ActionDtoSimpleName.replace("DTO", "");

		String datePrefix = performActionSpecificModifications(actionName);

		ExpressionParser parser = new SpelExpressionParser();

		EvaluationContext context = new StandardEvaluationContext(actionDetails);

		context.setVariable("date", new Date());

		Expression exp = parser.parseExpression(String.format("set%sDate(#date)", datePrefix));

		exp.getValue(context);
	}

	public static <ActionEntity> ActionEntity getByActionId(String ActionDtoSimpleName,
			Class<ActionEntity> ActionEntityRef, JpaRepository<ActionEntity, ?> actionsRepository, String actionId) {

		String actionName = ActionDtoSimpleName.replace("DTO", "");

		ExpressionParser parser = new SpelExpressionParser();

		EvaluationContext context = new StandardEvaluationContext(actionsRepository);

		context.setVariable("actionId", actionId);

		Expression exp = parser.parseExpression(String.format("getBy%sId(#actionId)", actionName));

		return exp.getValue(context, ActionEntityRef);
	}

	public static <ActionEntity> int deleteByActionId(String ActionDtoSimpleName,
			JpaRepository<ActionEntity, ?> actionsRepository, String actionId) {

		String actionName = ActionDtoSimpleName.replace("DTO", "");

		ExpressionParser parser = new SpelExpressionParser();

		EvaluationContext context = new StandardEvaluationContext(actionsRepository);

		context.setVariable("actionId", actionId);

		Expression exp = parser.parseExpression(String.format("deleteBy%sId(#actionId)", actionName));

		return exp.getValue(context, Integer.class);
	}

	public static <ActionEntity> boolean existsByActionId(String ActionDtoSimpleName,
			JpaRepository<ActionEntity, ?> actionsRepository, String actionId) {

		String actionName = ActionDtoSimpleName.replace("DTO", "");

		ExpressionParser parser = new SpelExpressionParser();

		EvaluationContext context = new StandardEvaluationContext(actionsRepository);

		context.setVariable("actionId", actionId);

		Expression exp = parser.parseExpression(String.format("existsBy%sId(#actionId)", actionName));

		return exp.getValue(context, Boolean.class);
	}

	public static <ActionEntity> Long getIdOfActionDetails(String ActionDtoSimpleName,
			Class<ActionEntity> ActionEntityRef, JpaRepository<ActionEntity, ?> actionsRepository, String actionId) {

		ActionEntity actionEntity = HelperMethods.<ActionEntity>getByActionId(ActionDtoSimpleName, ActionEntityRef,
				actionsRepository, actionId);

		ExpressionParser parser = new SpelExpressionParser();

		EvaluationContext context = new StandardEvaluationContext(actionEntity);

		Expression exp = parser.parseExpression("getId()");

		return exp.getValue(context, Long.class);
	}

	public static <ActionEntity> void setIdOfActionEntity(ActionEntity actionEntity, Long actionDetailsId) {

		ExpressionParser parser = new SpelExpressionParser();

		EvaluationContext context = new StandardEvaluationContext(actionEntity);

		context.setVariable("id", actionDetailsId);

		Expression exp = parser.parseExpression("setId(#id)");

		exp.getValue(context);
	}

	private static String performActionSpecificModifications(String actionName) {

		if (actionName.equals("Raise") || actionName.equals("Promotion") || actionName.equals("Permission")) {

			return "Response";
		}

		return actionName;
	}

}
