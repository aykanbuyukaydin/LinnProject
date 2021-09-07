Feature: US_027 Eyalet silme

Scenario Outline: TC_1001 Kullanici bir eyaleti silebilir

  Given Kullanici butun eyaletleri "https://www.gmibank.com/api/tp-states" endpointten okur
  And Kullanici bir eyaleti "<id>" siyle siler ve sildigini dogrular

Examples:
| id|
|/94702|