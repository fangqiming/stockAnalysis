package com.i000.stock.user.web.schedule;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @Author:qmfang
 * @Description:
 * @Date:Created in 17:26 2018/4/27
 * @Modified By:
 */
@Slf4j
@Component
public class MailSchedule {

//    @Resource
//    private MailFetchService mailFetchService;
//
//    @Resource
//    private AssetService assetService;
//
//    @Resource
//    private HoldService holdService;
//
//    @Resource
//    private UserInfoService userInfoService;
//
//    @Scheduled(cron = "0 35 15 * * ?")
//    public void fetchMail() throws Exception {
//        LocalDate localDate = mailFetchService.initMail();
//        System.out.println("开始时间:" + System.currentTimeMillis());
//        List<Hold> trade = holdService.getTrade();
//        if (Objects.nonNull(localDate)) {
//            Page<UserInfo> search = userInfoService.search(BaseSearchVo.builder().pageNo(1).pageSize(50).build());
//            double ceil = Math.ceil(search.getTotal() / 50.0);
//            calculate(search, localDate, trade);
//            for (int i = 2; i <= ceil; i++) {
//                Page<UserInfo> page = userInfoService.search(BaseSearchVo.builder().pageNo(i).pageSize(50).build());
//                calculate(page, localDate, trade);
//            }
//        }
//        System.out.println("结束时间:" + System.currentTimeMillis());
//    }
//
//
//    private void calculate(Page<UserInfo> page, LocalDate date, List<Hold> trade) {
//        if (!CollectionUtils.isEmpty(page.getList())) {
//            for (UserInfo userInfo : page.getList()) {
//                assetService.calculate(date, userInfo.getName(), trade);
//            }
//        }
//    }
}
