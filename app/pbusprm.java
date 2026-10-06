package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbusprm extends GXProcedure
{
   public pbusprm( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbusprm.class ), "" );
   }

   public pbusprm( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      pbusprm.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      pbusprm.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbusprm.this.AV12Clicod = aP1[0];
      this.aP1 = aP1;
      pbusprm.this.Gx_msg = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gx_msg = "" ;
      AV13Err_tab = (byte)(0) ;
      AV14Tabla = httpContext.getMessage( "DISCLI", "") ;
      /* Using cursor P00Q72 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV12Clicod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P00Q72_A252CliCod[0] ;
         n252CliCod = P00Q72_n252CliCod[0] ;
         A4196DisCliCod = P00Q72_A4196DisCliCod[0] ;
         AV13Err_tab = (byte)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV13Err_tab == 1 )
      {
         Gx_msg = httpContext.getMessage( "Error.Hay informacion en tabla ", "") + AV14Tabla ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV14Tabla = httpContext.getMessage( "ENS001", "") ;
      /* Using cursor P00Q73 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV12Clicod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A252CliCod = P00Q73_A252CliCod[0] ;
         n252CliCod = P00Q73_n252CliCod[0] ;
         A5536Lb_ColNom = P00Q73_A5536Lb_ColNom[0] ;
         A5532Lb_numero = P00Q73_A5532Lb_numero[0] ;
         AV13Err_tab = (byte)(1) ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      if ( AV13Err_tab == 1 )
      {
         Gx_msg = httpContext.getMessage( "Error.Hay informacion en tabla ", "") + AV14Tabla ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV14Tabla = httpContext.getMessage( "ENSLAV", "") ;
      /* Using cursor P00Q74 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV12Clicod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A252CliCod = P00Q74_A252CliCod[0] ;
         n252CliCod = P00Q74_n252CliCod[0] ;
         A4624EnsLHorR = P00Q74_A4624EnsLHorR[0] ;
         n4624EnsLHorR = P00Q74_n4624EnsLHorR[0] ;
         A4618EnsLCod = P00Q74_A4618EnsLCod[0] ;
         AV13Err_tab = (byte)(1) ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
      if ( AV13Err_tab == 1 )
      {
         Gx_msg = httpContext.getMessage( "Error.Hay informacion en tabla ", "") + AV14Tabla ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV14Tabla = httpContext.getMessage( "ENVBDG", "") ;
      /* Using cursor P00Q75 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV12Clicod)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A252CliCod = P00Q75_A252CliCod[0] ;
         n252CliCod = P00Q75_n252CliCod[0] ;
         A8177Bdg_Artc = P00Q75_A8177Bdg_Artc[0] ;
         n8177Bdg_Artc = P00Q75_n8177Bdg_Artc[0] ;
         A8174Bdg_hdr = P00Q75_A8174Bdg_hdr[0] ;
         A8175Bdg_Hdrr = P00Q75_A8175Bdg_Hdrr[0] ;
         A8176Bdg_Hdrp = P00Q75_A8176Bdg_Hdrp[0] ;
         AV13Err_tab = (byte)(1) ;
         pr_default.readNext(3);
      }
      pr_default.close(3);
      if ( AV13Err_tab == 1 )
      {
         Gx_msg = httpContext.getMessage( "Error.Hay informacion en tabla ", "") + AV14Tabla ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV14Tabla = httpContext.getMessage( "ESBR00", "") ;
      /* Using cursor P00Q76 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV12Clicod)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A252CliCod = P00Q76_A252CliCod[0] ;
         n252CliCod = P00Q76_n252CliCod[0] ;
         A9634Est_Any = P00Q76_A9634Est_Any[0] ;
         A9635Est_Mes = P00Q76_A9635Est_Mes[0] ;
         A9636Est_Dia = P00Q76_A9636Est_Dia[0] ;
         A9630Est_ColA = P00Q76_A9630Est_ColA[0] ;
         A9631Est_ColN = P00Q76_A9631Est_ColN[0] ;
         A9632Est_Tc = P00Q76_A9632Est_Tc[0] ;
         AV13Err_tab = (byte)(1) ;
         pr_default.readNext(4);
      }
      pr_default.close(4);
      if ( AV13Err_tab == 1 )
      {
         Gx_msg = httpContext.getMessage( "Error.Hay informacion en tabla ", "") + AV14Tabla ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV14Tabla = httpContext.getMessage( "ESTPRE", "") ;
      /* Using cursor P00Q77 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV12Clicod)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A252CliCod = P00Q77_A252CliCod[0] ;
         n252CliCod = P00Q77_n252CliCod[0] ;
         A5029PreEstFu = P00Q77_A5029PreEstFu[0] ;
         n5029PreEstFu = P00Q77_n5029PreEstFu[0] ;
         A4718DishCod = P00Q77_A4718DishCod[0] ;
         A5020TipEstCod = P00Q77_A5020TipEstCod[0] ;
         A5022GraCod = P00Q77_A5022GraCod[0] ;
         AV13Err_tab = (byte)(1) ;
         pr_default.readNext(5);
      }
      pr_default.close(5);
      if ( AV13Err_tab == 1 )
      {
         Gx_msg = httpContext.getMessage( "Error.Hay informacion en tabla ", "") + AV14Tabla ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV14Tabla = httpContext.getMessage( "FACPRO", "") ;
      /* Using cursor P00Q78 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(AV12Clicod)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A252CliCod = P00Q78_A252CliCod[0] ;
         n252CliCod = P00Q78_n252CliCod[0] ;
         A3665FacProTar = P00Q78_A3665FacProTar[0] ;
         A3661FacProAny = P00Q78_A3661FacProAny[0] ;
         A3662FacProSer = P00Q78_A3662FacProSer[0] ;
         A3663FacProInt = P00Q78_A3663FacProInt[0] ;
         A3664FacProTip = P00Q78_A3664FacProTip[0] ;
         AV13Err_tab = (byte)(1) ;
         pr_default.readNext(6);
      }
      pr_default.close(6);
      if ( AV13Err_tab == 1 )
      {
         Gx_msg = httpContext.getMessage( "Error.Hay informacion en tabla ", "") + AV14Tabla ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV14Tabla = httpContext.getMessage( "FASFCL", "") ;
      /* Using cursor P00Q79 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(AV12Clicod)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A252CliCod = P00Q79_A252CliCod[0] ;
         n252CliCod = P00Q79_n252CliCod[0] ;
         A4589FFProCod = P00Q79_A4589FFProCod[0] ;
         AV13Err_tab = (byte)(1) ;
         pr_default.readNext(7);
      }
      pr_default.close(7);
      if ( AV13Err_tab == 1 )
      {
         Gx_msg = httpContext.getMessage( "Error.Hay informacion en tabla ", "") + AV14Tabla ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV14Tabla = httpContext.getMessage( "GASCOL", "") ;
      /* Using cursor P00Q710 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(AV12Clicod)});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A252CliCod = P00Q710_A252CliCod[0] ;
         n252CliCod = P00Q710_n252CliCod[0] ;
         A5346GasColHoj = P00Q710_A5346GasColHoj[0] ;
         n5346GasColHoj = P00Q710_n5346GasColHoj[0] ;
         A5344GasColNum = P00Q710_A5344GasColNum[0] ;
         AV13Err_tab = (byte)(1) ;
         pr_default.readNext(8);
      }
      pr_default.close(8);
      if ( AV13Err_tab == 1 )
      {
         Gx_msg = httpContext.getMessage( "Error.Hay informacion en tabla ", "") + AV14Tabla ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV14Tabla = httpContext.getMessage( "HISBAR", "") ;
      /* Using cursor P00Q711 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(AV12Clicod)});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A252CliCod = P00Q711_A252CliCod[0] ;
         n252CliCod = P00Q711_n252CliCod[0] ;
         A509HbaColNom = P00Q711_A509HbaColNom[0] ;
         n509HbaColNom = P00Q711_n509HbaColNom[0] ;
         A506HbaBarCod = P00Q711_A506HbaBarCod[0] ;
         A508HbaBarReo = P00Q711_A508HbaBarReo[0] ;
         A507HbaBarPar = P00Q711_A507HbaBarPar[0] ;
         AV13Err_tab = (byte)(1) ;
         pr_default.readNext(9);
      }
      pr_default.close(9);
      if ( AV13Err_tab == 1 )
      {
         Gx_msg = httpContext.getMessage( "Error.Hay informacion en tabla ", "") + AV14Tabla ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV14Tabla = httpContext.getMessage( "HISMAC", "") ;
      /* Using cursor P00Q712 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(AV12Clicod)});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A252CliCod = P00Q712_A252CliCod[0] ;
         n252CliCod = P00Q712_n252CliCod[0] ;
         A2903HMaPrdNor = P00Q712_A2903HMaPrdNor[0] ;
         n2903HMaPrdNor = P00Q712_n2903HMaPrdNor[0] ;
         A2891HMaForSer = P00Q712_A2891HMaForSer[0] ;
         A2892HMaForCNom = P00Q712_A2892HMaForCNom[0] ;
         A2893HMaForCNum = P00Q712_A2893HMaForCNum[0] ;
         A2894HMaTipCCod = P00Q712_A2894HMaTipCCod[0] ;
         A2895HMaForNumC = P00Q712_A2895HMaForNumC[0] ;
         A2897HMaColLin = P00Q712_A2897HMaColLin[0] ;
         A2896HMaFec = P00Q712_A2896HMaFec[0] ;
         A2907HmaLin = P00Q712_A2907HmaLin[0] ;
         AV13Err_tab = (byte)(1) ;
         pr_default.readNext(10);
      }
      pr_default.close(10);
      if ( AV13Err_tab == 1 )
      {
         Gx_msg = httpContext.getMessage( "Error.Hay informacion en tabla ", "") + AV14Tabla ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV14Tabla = httpContext.getMessage( "HISREH", "") ;
      /* Using cursor P00Q713 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(AV12Clicod)});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A252CliCod = P00Q713_A252CliCod[0] ;
         n252CliCod = P00Q713_n252CliCod[0] ;
         A4518HreBarDsc = P00Q713_A4518HreBarDsc[0] ;
         n4518HreBarDsc = P00Q713_n4518HreBarDsc[0] ;
         A4492HreBarCod = P00Q713_A4492HreBarCod[0] ;
         A4493HreBarReo = P00Q713_A4493HreBarReo[0] ;
         A4494HreBarPar = P00Q713_A4494HreBarPar[0] ;
         A4495HreNumCie = P00Q713_A4495HreNumCie[0] ;
         AV13Err_tab = (byte)(1) ;
         pr_default.readNext(11);
      }
      pr_default.close(11);
      if ( AV13Err_tab == 1 )
      {
         Gx_msg = httpContext.getMessage( "Error.Hay informacion en tabla ", "") + AV14Tabla ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV14Tabla = httpContext.getMessage( "HISREO", "") ;
      /* Using cursor P00Q714 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(AV12Clicod)});
      while ( (pr_default.getStatus(12) != 101) )
      {
         A252CliCod = P00Q714_A252CliCod[0] ;
         n252CliCod = P00Q714_n252CliCod[0] ;
         A546HisColNom = P00Q714_A546HisColNom[0] ;
         n546HisColNom = P00Q714_n546HisColNom[0] ;
         A539HisBarCod = P00Q714_A539HisBarCod[0] ;
         A545HisCodReo = P00Q714_A545HisCodReo[0] ;
         A544HisCodPar = P00Q714_A544HisCodPar[0] ;
         A833TipDefCod = P00Q714_A833TipDefCod[0] ;
         AV13Err_tab = (byte)(1) ;
         pr_default.readNext(12);
      }
      pr_default.close(12);
      if ( AV13Err_tab == 1 )
      {
         Gx_msg = httpContext.getMessage( "Error.Hay informacion en tabla ", "") + AV14Tabla ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV14Tabla = httpContext.getMessage( "HLREOP", "") ;
      /* Using cursor P00Q715 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(AV12Clicod)});
      while ( (pr_default.getStatus(13) != 101) )
      {
         A5064Hl_causa = P00Q715_A5064Hl_causa[0] ;
         n5064Hl_causa = P00Q715_n5064Hl_causa[0] ;
         A252CliCod = P00Q715_A252CliCod[0] ;
         n252CliCod = P00Q715_n252CliCod[0] ;
         A5059Hl_hdr = P00Q715_A5059Hl_hdr[0] ;
         A5060Hl_hdrr = P00Q715_A5060Hl_hdrr[0] ;
         A5061Hl_hdrp = P00Q715_A5061Hl_hdrp[0] ;
         AV13Err_tab = (byte)(1) ;
         pr_default.readNext(13);
      }
      pr_default.close(13);
      if ( AV13Err_tab == 1 )
      {
         Gx_msg = httpContext.getMessage( "Error.Hay informacion en tabla ", "") + AV14Tabla ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV14Tabla = httpContext.getMessage( "LCONTI", "") ;
      /* Using cursor P00Q716 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(AV12Clicod)});
      while ( (pr_default.getStatus(14) != 101) )
      {
         A252CliCod = P00Q716_A252CliCod[0] ;
         n252CliCod = P00Q716_n252CliCod[0] ;
         A1936BarSerTin = P00Q716_A1936BarSerTin[0] ;
         n1936BarSerTin = P00Q716_n1936BarSerTin[0] ;
         A3646EstTinAny = P00Q716_A3646EstTinAny[0] ;
         A3647EstTinMes = P00Q716_A3647EstTinMes[0] ;
         A3648EstTinDia = P00Q716_A3648EstTinDia[0] ;
         A1929EstTinNr = P00Q716_A1929EstTinNr[0] ;
         AV13Err_tab = (byte)(1) ;
         pr_default.readNext(14);
      }
      pr_default.close(14);
      if ( AV13Err_tab == 1 )
      {
         Gx_msg = httpContext.getMessage( "Error.Hay informacion en tabla ", "") + AV14Tabla ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV14Tabla = httpContext.getMessage( "LCOSTI", "") ;
      /* Using cursor P00Q717 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(AV12Clicod)});
      while ( (pr_default.getStatus(15) != 101) )
      {
         A252CliCod = P00Q717_A252CliCod[0] ;
         n252CliCod = P00Q717_n252CliCod[0] ;
         A3013CoKgs = P00Q717_A3013CoKgs[0] ;
         n3013CoKgs = P00Q717_n3013CoKgs[0] ;
         A3061Codia = P00Q717_A3061Codia[0] ;
         A3062CoMes = P00Q717_A3062CoMes[0] ;
         A3063CoAny = P00Q717_A3063CoAny[0] ;
         A3065CoLin = P00Q717_A3065CoLin[0] ;
         A3010CoBarCod = P00Q717_A3010CoBarCod[0] ;
         A3011CoBarReo = P00Q717_A3011CoBarReo[0] ;
         A3012CoBarPar = P00Q717_A3012CoBarPar[0] ;
         AV13Err_tab = (byte)(1) ;
         pr_default.readNext(15);
      }
      pr_default.close(15);
      if ( AV13Err_tab == 1 )
      {
         Gx_msg = httpContext.getMessage( "Error.Hay informacion en tabla ", "") + AV14Tabla ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV14Tabla = httpContext.getMessage( "LKGSTI", "") ;
      /* Using cursor P00Q718 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(AV12Clicod)});
      while ( (pr_default.getStatus(16) != 101) )
      {
         A252CliCod = P00Q718_A252CliCod[0] ;
         n252CliCod = P00Q718_n252CliCod[0] ;
         A2970TiCosteA = P00Q718_A2970TiCosteA[0] ;
         n2970TiCosteA = P00Q718_n2970TiCosteA[0] ;
         A2954TiDia = P00Q718_A2954TiDia[0] ;
         A2955TiMes = P00Q718_A2955TiMes[0] ;
         A2956TiAny = P00Q718_A2956TiAny[0] ;
         A2958TiLin = P00Q718_A2958TiLin[0] ;
         A2959TiBarCod = P00Q718_A2959TiBarCod[0] ;
         A2960TiBarReo = P00Q718_A2960TiBarReo[0] ;
         A2961TiBarPar = P00Q718_A2961TiBarPar[0] ;
         AV13Err_tab = (byte)(1) ;
         pr_default.readNext(16);
      }
      pr_default.close(16);
      if ( AV13Err_tab == 1 )
      {
         Gx_msg = httpContext.getMessage( "Error.Hay informacion en tabla ", "") + AV14Tabla ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV14Tabla = httpContext.getMessage( "MEZCLA", "") ;
      /* Using cursor P00Q719 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(AV12Clicod)});
      while ( (pr_default.getStatus(17) != 101) )
      {
         A252CliCod = P00Q719_A252CliCod[0] ;
         n252CliCod = P00Q719_n252CliCod[0] ;
         A5239MezFecPda = P00Q719_A5239MezFecPda[0] ;
         n5239MezFecPda = P00Q719_n5239MezFecPda[0] ;
         A5234MezCod = P00Q719_A5234MezCod[0] ;
         AV13Err_tab = (byte)(1) ;
         pr_default.readNext(17);
      }
      pr_default.close(17);
      if ( AV13Err_tab == 1 )
      {
         Gx_msg = httpContext.getMessage( "Error.Hay informacion en tabla ", "") + AV14Tabla ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV14Tabla = httpContext.getMessage( "MEZCLI", "") ;
      /* Using cursor P00Q720 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(AV12Clicod)});
      while ( (pr_default.getStatus(18) != 101) )
      {
         A252CliCod = P00Q720_A252CliCod[0] ;
         n252CliCod = P00Q720_n252CliCod[0] ;
         A5812MMezFecPda = P00Q720_A5812MMezFecPda[0] ;
         n5812MMezFecPda = P00Q720_n5812MMezFecPda[0] ;
         A5809MMezCod = P00Q720_A5809MMezCod[0] ;
         AV13Err_tab = (byte)(1) ;
         pr_default.readNext(18);
      }
      pr_default.close(18);
      if ( AV13Err_tab == 1 )
      {
         Gx_msg = httpContext.getMessage( "Error.Hay informacion en tabla ", "") + AV14Tabla ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV14Tabla = httpContext.getMessage( "NOTRE", "") ;
      /* Using cursor P00Q721 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(AV12Clicod)});
      while ( (pr_default.getStatus(19) != 101) )
      {
         A252CliCod = P00Q721_A252CliCod[0] ;
         n252CliCod = P00Q721_n252CliCod[0] ;
         A7548Alb_NFisC = P00Q721_A7548Alb_NFisC[0] ;
         AV13Err_tab = (byte)(1) ;
         pr_default.readNext(19);
      }
      pr_default.close(19);
      if ( AV13Err_tab == 1 )
      {
         Gx_msg = httpContext.getMessage( "Error.Hay informacion en tabla ", "") + AV14Tabla ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV14Tabla = httpContext.getMessage( "OPEANT", "") ;
      /* Using cursor P00Q722 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(AV12Clicod)});
      while ( (pr_default.getStatus(20) != 101) )
      {
         A252CliCod = P00Q722_A252CliCod[0] ;
         n252CliCod = P00Q722_n252CliCod[0] ;
         A2422OpeAntKgm = P00Q722_A2422OpeAntKgm[0] ;
         n2422OpeAntKgm = P00Q722_n2422OpeAntKgm[0] ;
         A2420OpeAntCod = P00Q722_A2420OpeAntCod[0] ;
         AV13Err_tab = (byte)(1) ;
         pr_default.readNext(20);
      }
      pr_default.close(20);
      if ( AV13Err_tab == 1 )
      {
         Gx_msg = httpContext.getMessage( "Error.Hay informacion en tabla ", "") + AV14Tabla ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV14Tabla = httpContext.getMessage( "OTINT", "") ;
      /* Using cursor P00Q723 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(AV12Clicod)});
      while ( (pr_default.getStatus(21) != 101) )
      {
         A252CliCod = P00Q723_A252CliCod[0] ;
         n252CliCod = P00Q723_n252CliCod[0] ;
         A7846Int_ColNn = P00Q723_A7846Int_ColNn[0] ;
         n7846Int_ColNn = P00Q723_n7846Int_ColNn[0] ;
         A7843Int_Num = P00Q723_A7843Int_Num[0] ;
         AV13Err_tab = (byte)(1) ;
         pr_default.readNext(21);
      }
      pr_default.close(21);
      if ( AV13Err_tab == 1 )
      {
         Gx_msg = httpContext.getMessage( "Error.Hay informacion en tabla ", "") + AV14Tabla ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV14Tabla = httpContext.getMessage( "PAGCLI", "") ;
      /* Using cursor P00Q724 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(AV12Clicod)});
      while ( (pr_default.getStatus(22) != 101) )
      {
         A252CliCod = P00Q724_A252CliCod[0] ;
         n252CliCod = P00Q724_n252CliCod[0] ;
         A5132PagImpo = P00Q724_A5132PagImpo[0] ;
         n5132PagImpo = P00Q724_n5132PagImpo[0] ;
         A5130PagIden = P00Q724_A5130PagIden[0] ;
         AV13Err_tab = (byte)(1) ;
         pr_default.readNext(22);
      }
      pr_default.close(22);
      if ( AV13Err_tab == 1 )
      {
         Gx_msg = httpContext.getMessage( "Error.Hay informacion en tabla ", "") + AV14Tabla ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV14Tabla = httpContext.getMessage( "PENMD", "") ;
      /* Using cursor P00Q725 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(AV12Clicod)});
      while ( (pr_default.getStatus(23) != 101) )
      {
         A252CliCod = P00Q725_A252CliCod[0] ;
         n252CliCod = P00Q725_n252CliCod[0] ;
         A8405PMDKgmMax = P00Q725_A8405PMDKgmMax[0] ;
         A8403PMDLin = P00Q725_A8403PMDLin[0] ;
         AV13Err_tab = (byte)(1) ;
         pr_default.readNext(23);
      }
      pr_default.close(23);
      if ( AV13Err_tab == 1 )
      {
         Gx_msg = httpContext.getMessage( "Error.Hay informacion en tabla ", "") + AV14Tabla ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV14Tabla = httpContext.getMessage( "PREFAS", "") ;
      /* Using cursor P00Q726 */
      pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(AV12Clicod)});
      while ( (pr_default.getStatus(24) != 101) )
      {
         A252CliCod = P00Q726_A252CliCod[0] ;
         n252CliCod = P00Q726_n252CliCod[0] ;
         A470FasSumTin = P00Q726_A470FasSumTin[0] ;
         n470FasSumTin = P00Q726_n470FasSumTin[0] ;
         A457FasCod = P00Q726_A457FasCod[0] ;
         AV13Err_tab = (byte)(1) ;
         pr_default.readNext(24);
      }
      pr_default.close(24);
      if ( AV13Err_tab == 1 )
      {
         Gx_msg = httpContext.getMessage( "Error.Hay informacion en tabla ", "") + AV14Tabla ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV14Tabla = httpContext.getMessage( "PREFSP", "") ;
      /* Using cursor P00Q727 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(AV12Clicod)});
      while ( (pr_default.getStatus(25) != 101) )
      {
         A252CliCod = P00Q727_A252CliCod[0] ;
         n252CliCod = P00Q727_n252CliCod[0] ;
         A5428FasPreCod = P00Q727_A5428FasPreCod[0] ;
         AV13Err_tab = (byte)(1) ;
         pr_default.readNext(25);
      }
      pr_default.close(25);
      if ( AV13Err_tab == 1 )
      {
         Gx_msg = httpContext.getMessage( "Error.Hay informacion en tabla ", "") + AV14Tabla ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV14Tabla = httpContext.getMessage( "PREKIL", "") ;
      /* Using cursor P00Q728 */
      pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(AV12Clicod)});
      while ( (pr_default.getStatus(26) != 101) )
      {
         A252CliCod = P00Q728_A252CliCod[0] ;
         n252CliCod = P00Q728_n252CliCod[0] ;
         A3321CliPreKgs = P00Q728_A3321CliPreKgs[0] ;
         n3321CliPreKgs = P00Q728_n3321CliPreKgs[0] ;
         A3320CliLimKgs = P00Q728_A3320CliLimKgs[0] ;
         AV13Err_tab = (byte)(1) ;
         pr_default.readNext(26);
      }
      pr_default.close(26);
      if ( AV13Err_tab == 1 )
      {
         Gx_msg = httpContext.getMessage( "Error.Hay informacion en tabla ", "") + AV14Tabla ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV14Tabla = httpContext.getMessage( "PREQL", "") ;
      /* Using cursor P00Q729 */
      pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(AV12Clicod)});
      while ( (pr_default.getStatus(27) != 101) )
      {
         A252CliCod = P00Q729_A252CliCod[0] ;
         n252CliCod = P00Q729_n252CliCod[0] ;
         A5448ProForPK = P00Q729_A5448ProForPK[0] ;
         n5448ProForPK = P00Q729_n5448ProForPK[0] ;
         A5452P_ForCod = P00Q729_A5452P_ForCod[0] ;
         AV13Err_tab = (byte)(1) ;
         pr_default.readNext(27);
      }
      pr_default.close(27);
      if ( AV13Err_tab == 1 )
      {
         Gx_msg = httpContext.getMessage( "Error.Hay informacion en tabla ", "") + AV14Tabla ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV14Tabla = httpContext.getMessage( "PRETAI", "") ;
      /* Using cursor P00Q730 */
      pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(AV12Clicod)});
      while ( (pr_default.getStatus(28) != 101) )
      {
         A252CliCod = P00Q730_A252CliCod[0] ;
         n252CliCod = P00Q730_n252CliCod[0] ;
         A8521PreTAICod = P00Q730_A8521PreTAICod[0] ;
         AV13Err_tab = (byte)(1) ;
         pr_default.readNext(28);
      }
      pr_default.close(28);
      if ( AV13Err_tab == 1 )
      {
         Gx_msg = httpContext.getMessage( "Error.Hay informacion en tabla ", "") + AV14Tabla ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV14Tabla = httpContext.getMessage( "PROMD", "") ;
      /* Using cursor P00Q731 */
      pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(AV12Clicod)});
      while ( (pr_default.getStatus(29) != 101) )
      {
         A252CliCod = P00Q731_A252CliCod[0] ;
         n252CliCod = P00Q731_n252CliCod[0] ;
         A8392PMDDsc = P00Q731_A8392PMDDsc[0] ;
         n8392PMDDsc = P00Q731_n8392PMDDsc[0] ;
         A8391PMDCod = P00Q731_A8391PMDCod[0] ;
         AV13Err_tab = (byte)(1) ;
         pr_default.readNext(29);
      }
      pr_default.close(29);
      if ( AV13Err_tab == 1 )
      {
         Gx_msg = httpContext.getMessage( "Error.Hay informacion en tabla ", "") + AV14Tabla ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV14Tabla = httpContext.getMessage( "PZASPT", "") ;
      /* Using cursor P00Q732 */
      pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(AV12Clicod)});
      while ( (pr_default.getStatus(30) != 101) )
      {
         A252CliCod = P00Q732_A252CliCod[0] ;
         n252CliCod = P00Q732_n252CliCod[0] ;
         A7788Prt_Artcod = P00Q732_A7788Prt_Artcod[0] ;
         A7801Prt_NumPnt = P00Q732_A7801Prt_NumPnt[0] ;
         AV13Err_tab = (byte)(1) ;
         pr_default.readNext(30);
      }
      pr_default.close(30);
      if ( AV13Err_tab == 1 )
      {
         Gx_msg = httpContext.getMessage( "Error.Hay informacion en tabla ", "") + AV14Tabla ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV14Tabla = httpContext.getMessage( "RECMA1", "") ;
      /* Using cursor P00Q733 */
      pr_default.execute(31, new Object[] {A396EmprCod, Integer.valueOf(AV12Clicod)});
      while ( (pr_default.getStatus(31) != 101) )
      {
         A252CliCod = P00Q733_A252CliCod[0] ;
         n252CliCod = P00Q733_n252CliCod[0] ;
         A6342C_RecMatDs = P00Q733_A6342C_RecMatDs[0] ;
         n6342C_RecMatDs = P00Q733_n6342C_RecMatDs[0] ;
         A6319C_Barcod = P00Q733_A6319C_Barcod[0] ;
         A6320C_Barcodre = P00Q733_A6320C_Barcodre[0] ;
         A6321C_Barcodpa = P00Q733_A6321C_Barcodpa[0] ;
         A6322C_Reclinma = P00Q733_A6322C_Reclinma[0] ;
         AV13Err_tab = (byte)(1) ;
         pr_default.readNext(31);
      }
      pr_default.close(31);
      if ( AV13Err_tab == 1 )
      {
         Gx_msg = httpContext.getMessage( "Error.Hay informacion en tabla ", "") + AV14Tabla ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV14Tabla = httpContext.getMessage( "REGCOR", "") ;
      /* Using cursor P00Q734 */
      pr_default.execute(32, new Object[] {A396EmprCod, Integer.valueOf(AV12Clicod)});
      while ( (pr_default.getStatus(32) != 101) )
      {
         A252CliCod = P00Q734_A252CliCod[0] ;
         n252CliCod = P00Q734_n252CliCod[0] ;
         A6935Lb_rccorc = P00Q734_A6935Lb_rccorc[0] ;
         n6935Lb_rccorc = P00Q734_n6935Lb_rccorc[0] ;
         A6930Lb_rclin = P00Q734_A6930Lb_rclin[0] ;
         AV13Err_tab = (byte)(1) ;
         pr_default.readNext(32);
      }
      pr_default.close(32);
      if ( AV13Err_tab == 1 )
      {
         Gx_msg = httpContext.getMessage( "Error.Hay informacion en tabla ", "") + AV14Tabla ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV14Tabla = httpContext.getMessage( "REMLAV", "") ;
      /* Using cursor P00Q735 */
      pr_default.execute(33, new Object[] {A396EmprCod, Integer.valueOf(AV12Clicod)});
      while ( (pr_default.getStatus(33) != 101) )
      {
         A252CliCod = P00Q735_A252CliCod[0] ;
         n252CliCod = P00Q735_n252CliCod[0] ;
         A7569Su_AlbLocC = P00Q735_A7569Su_AlbLocC[0] ;
         n7569Su_AlbLocC = P00Q735_n7569Su_AlbLocC[0] ;
         A7566Su_AlbCod = P00Q735_A7566Su_AlbCod[0] ;
         AV13Err_tab = (byte)(1) ;
         pr_default.readNext(33);
      }
      pr_default.close(33);
      if ( AV13Err_tab == 1 )
      {
         Gx_msg = httpContext.getMessage( "Error.Hay informacion en tabla ", "") + AV14Tabla ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV14Tabla = httpContext.getMessage( "TEX000", "") ;
      /* Using cursor P00Q736 */
      pr_default.execute(34, new Object[] {A396EmprCod, Integer.valueOf(AV12Clicod)});
      while ( (pr_default.getStatus(34) != 101) )
      {
         A252CliCod = P00Q736_A252CliCod[0] ;
         n252CliCod = P00Q736_n252CliCod[0] ;
         A6856Tex_Estado = P00Q736_A6856Tex_Estado[0] ;
         n6856Tex_Estado = P00Q736_n6856Tex_Estado[0] ;
         A6850Tex_NPed = P00Q736_A6850Tex_NPed[0] ;
         AV13Err_tab = (byte)(1) ;
         pr_default.readNext(34);
      }
      pr_default.close(34);
      if ( AV13Err_tab == 1 )
      {
         Gx_msg = httpContext.getMessage( "Error.Hay informacion en tabla ", "") + AV14Tabla ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV14Tabla = httpContext.getMessage( "VISCLI", "") ;
      /* Using cursor P00Q737 */
      pr_default.execute(35, new Object[] {A396EmprCod, Integer.valueOf(AV12Clicod)});
      while ( (pr_default.getStatus(35) != 101) )
      {
         A252CliCod = P00Q737_A252CliCod[0] ;
         n252CliCod = P00Q737_n252CliCod[0] ;
         A29Com_lin = P00Q737_A29Com_lin[0] ;
         AV13Err_tab = (byte)(1) ;
         pr_default.readNext(35);
      }
      pr_default.close(35);
      if ( AV13Err_tab == 1 )
      {
         Gx_msg = httpContext.getMessage( "Error.Hay informacion en tabla ", "") + AV14Tabla ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV14Tabla = httpContext.getMessage( "WEBUSU", "") ;
      /* Using cursor P00Q738 */
      pr_default.execute(36, new Object[] {A396EmprCod, Integer.valueOf(AV12Clicod)});
      while ( (pr_default.getStatus(36) != 101) )
      {
         A252CliCod = P00Q738_A252CliCod[0] ;
         n252CliCod = P00Q738_n252CliCod[0] ;
         A4187WebUsuEmai = P00Q738_A4187WebUsuEmai[0] ;
         n4187WebUsuEmai = P00Q738_n4187WebUsuEmai[0] ;
         A4185WEBUSU = P00Q738_A4185WEBUSU[0] ;
         AV13Err_tab = (byte)(1) ;
         pr_default.readNext(36);
      }
      pr_default.close(36);
      if ( AV13Err_tab == 1 )
      {
         Gx_msg = httpContext.getMessage( "Error.Hay informacion en tabla ", "") + AV14Tabla ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV14Tabla = httpContext.getMessage( "WEDIEM", "") ;
      /* Using cursor P00Q739 */
      pr_default.execute(37, new Object[] {A396EmprCod, Integer.valueOf(AV12Clicod)});
      while ( (pr_default.getStatus(37) != 101) )
      {
         A252CliCod = P00Q739_A252CliCod[0] ;
         n252CliCod = P00Q739_n252CliCod[0] ;
         A4079WEBDISCOD = P00Q739_A4079WEBDISCOD[0] ;
         AV13Err_tab = (byte)(1) ;
         pr_default.readNext(37);
      }
      pr_default.close(37);
      if ( AV13Err_tab == 1 )
      {
         Gx_msg = httpContext.getMessage( "Error.Hay informacion en tabla ", "") + AV14Tabla ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV14Tabla = httpContext.getMessage( "XHDR", "") ;
      /* Using cursor P00Q740 */
      pr_default.execute(38, new Object[] {A396EmprCod, Integer.valueOf(AV12Clicod)});
      while ( (pr_default.getStatus(38) != 101) )
      {
         A252CliCod = P00Q740_A252CliCod[0] ;
         n252CliCod = P00Q740_n252CliCod[0] ;
         A4201XHDRDisCli = P00Q740_A4201XHDRDisCli[0] ;
         n4201XHDRDisCli = P00Q740_n4201XHDRDisCli[0] ;
         A4198XHDRCod = P00Q740_A4198XHDRCod[0] ;
         A4199XHDRReo = P00Q740_A4199XHDRReo[0] ;
         A4200XHDRPar = P00Q740_A4200XHDRPar[0] ;
         AV13Err_tab = (byte)(1) ;
         pr_default.readNext(38);
      }
      pr_default.close(38);
      if ( AV13Err_tab == 1 )
      {
         Gx_msg = httpContext.getMessage( "Error.Hay informacion en tabla ", "") + AV14Tabla ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbusprm.this.A396EmprCod;
      this.aP1[0] = pbusprm.this.AV12Clicod;
      this.aP2[0] = pbusprm.this.Gx_msg;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV14Tabla = "" ;
      scmdbuf = "" ;
      P00Q72_A396EmprCod = new String[] {""} ;
      P00Q72_A252CliCod = new int[1] ;
      P00Q72_n252CliCod = new boolean[] {false} ;
      P00Q72_A4196DisCliCod = new String[] {""} ;
      A4196DisCliCod = "" ;
      P00Q73_A396EmprCod = new String[] {""} ;
      P00Q73_A252CliCod = new int[1] ;
      P00Q73_n252CliCod = new boolean[] {false} ;
      P00Q73_A5536Lb_ColNom = new String[] {""} ;
      P00Q73_A5532Lb_numero = new int[1] ;
      A5536Lb_ColNom = "" ;
      P00Q74_A396EmprCod = new String[] {""} ;
      P00Q74_A252CliCod = new int[1] ;
      P00Q74_n252CliCod = new boolean[] {false} ;
      P00Q74_A4624EnsLHorR = new java.util.Date[] {GXutil.nullDate()} ;
      P00Q74_n4624EnsLHorR = new boolean[] {false} ;
      P00Q74_A4618EnsLCod = new int[1] ;
      A4624EnsLHorR = GXutil.resetTime( GXutil.nullDate() );
      P00Q75_A396EmprCod = new String[] {""} ;
      P00Q75_A252CliCod = new int[1] ;
      P00Q75_n252CliCod = new boolean[] {false} ;
      P00Q75_A8177Bdg_Artc = new String[] {""} ;
      P00Q75_n8177Bdg_Artc = new boolean[] {false} ;
      P00Q75_A8174Bdg_hdr = new int[1] ;
      P00Q75_A8175Bdg_Hdrr = new byte[1] ;
      P00Q75_A8176Bdg_Hdrp = new String[] {""} ;
      A8177Bdg_Artc = "" ;
      A8176Bdg_Hdrp = "" ;
      P00Q76_A396EmprCod = new String[] {""} ;
      P00Q76_A252CliCod = new int[1] ;
      P00Q76_n252CliCod = new boolean[] {false} ;
      P00Q76_A9634Est_Any = new short[1] ;
      P00Q76_A9635Est_Mes = new byte[1] ;
      P00Q76_A9636Est_Dia = new byte[1] ;
      P00Q76_A9630Est_ColA = new String[] {""} ;
      P00Q76_A9631Est_ColN = new int[1] ;
      P00Q76_A9632Est_Tc = new byte[1] ;
      A9630Est_ColA = "" ;
      P00Q77_A396EmprCod = new String[] {""} ;
      P00Q77_A252CliCod = new int[1] ;
      P00Q77_n252CliCod = new boolean[] {false} ;
      P00Q77_A5029PreEstFu = new java.util.Date[] {GXutil.nullDate()} ;
      P00Q77_n5029PreEstFu = new boolean[] {false} ;
      P00Q77_A4718DishCod = new String[] {""} ;
      P00Q77_A5020TipEstCod = new byte[1] ;
      P00Q77_A5022GraCod = new byte[1] ;
      A5029PreEstFu = GXutil.nullDate() ;
      A4718DishCod = "" ;
      P00Q78_A396EmprCod = new String[] {""} ;
      P00Q78_A252CliCod = new int[1] ;
      P00Q78_n252CliCod = new boolean[] {false} ;
      P00Q78_A3665FacProTar = new short[1] ;
      P00Q78_A3661FacProAny = new short[1] ;
      P00Q78_A3662FacProSer = new String[] {""} ;
      P00Q78_A3663FacProInt = new byte[1] ;
      P00Q78_A3664FacProTip = new byte[1] ;
      A3662FacProSer = "" ;
      P00Q79_A396EmprCod = new String[] {""} ;
      P00Q79_A252CliCod = new int[1] ;
      P00Q79_n252CliCod = new boolean[] {false} ;
      P00Q79_A4589FFProCod = new String[] {""} ;
      A4589FFProCod = "" ;
      P00Q710_A396EmprCod = new String[] {""} ;
      P00Q710_A252CliCod = new int[1] ;
      P00Q710_n252CliCod = new boolean[] {false} ;
      P00Q710_A5346GasColHoj = new short[1] ;
      P00Q710_n5346GasColHoj = new boolean[] {false} ;
      P00Q710_A5344GasColNum = new int[1] ;
      P00Q711_A396EmprCod = new String[] {""} ;
      P00Q711_A252CliCod = new int[1] ;
      P00Q711_n252CliCod = new boolean[] {false} ;
      P00Q711_A509HbaColNom = new String[] {""} ;
      P00Q711_n509HbaColNom = new boolean[] {false} ;
      P00Q711_A506HbaBarCod = new int[1] ;
      P00Q711_A508HbaBarReo = new byte[1] ;
      P00Q711_A507HbaBarPar = new String[] {""} ;
      A509HbaColNom = "" ;
      A507HbaBarPar = "" ;
      P00Q712_A396EmprCod = new String[] {""} ;
      P00Q712_A252CliCod = new int[1] ;
      P00Q712_n252CliCod = new boolean[] {false} ;
      P00Q712_A2903HMaPrdNor = new short[1] ;
      P00Q712_n2903HMaPrdNor = new boolean[] {false} ;
      P00Q712_A2891HMaForSer = new String[] {""} ;
      P00Q712_A2892HMaForCNom = new String[] {""} ;
      P00Q712_A2893HMaForCNum = new int[1] ;
      P00Q712_A2894HMaTipCCod = new byte[1] ;
      P00Q712_A2895HMaForNumC = new int[1] ;
      P00Q712_A2897HMaColLin = new short[1] ;
      P00Q712_A2896HMaFec = new java.util.Date[] {GXutil.nullDate()} ;
      P00Q712_A2907HmaLin = new short[1] ;
      A2891HMaForSer = "" ;
      A2892HMaForCNom = "" ;
      A2896HMaFec = GXutil.nullDate() ;
      P00Q713_A396EmprCod = new String[] {""} ;
      P00Q713_A252CliCod = new int[1] ;
      P00Q713_n252CliCod = new boolean[] {false} ;
      P00Q713_A4518HreBarDsc = new String[] {""} ;
      P00Q713_n4518HreBarDsc = new boolean[] {false} ;
      P00Q713_A4492HreBarCod = new int[1] ;
      P00Q713_A4493HreBarReo = new byte[1] ;
      P00Q713_A4494HreBarPar = new String[] {""} ;
      P00Q713_A4495HreNumCie = new byte[1] ;
      A4518HreBarDsc = "" ;
      A4494HreBarPar = "" ;
      P00Q714_A396EmprCod = new String[] {""} ;
      P00Q714_A252CliCod = new int[1] ;
      P00Q714_n252CliCod = new boolean[] {false} ;
      P00Q714_A546HisColNom = new String[] {""} ;
      P00Q714_n546HisColNom = new boolean[] {false} ;
      P00Q714_A539HisBarCod = new int[1] ;
      P00Q714_A545HisCodReo = new byte[1] ;
      P00Q714_A544HisCodPar = new String[] {""} ;
      P00Q714_A833TipDefCod = new short[1] ;
      A546HisColNom = "" ;
      A544HisCodPar = "" ;
      P00Q715_A5064Hl_causa = new String[] {""} ;
      P00Q715_n5064Hl_causa = new boolean[] {false} ;
      P00Q715_A396EmprCod = new String[] {""} ;
      P00Q715_A252CliCod = new int[1] ;
      P00Q715_n252CliCod = new boolean[] {false} ;
      P00Q715_A5059Hl_hdr = new int[1] ;
      P00Q715_A5060Hl_hdrr = new byte[1] ;
      P00Q715_A5061Hl_hdrp = new String[] {""} ;
      A5064Hl_causa = "" ;
      A5061Hl_hdrp = "" ;
      P00Q716_A396EmprCod = new String[] {""} ;
      P00Q716_A252CliCod = new int[1] ;
      P00Q716_n252CliCod = new boolean[] {false} ;
      P00Q716_A1936BarSerTin = new String[] {""} ;
      P00Q716_n1936BarSerTin = new boolean[] {false} ;
      P00Q716_A3646EstTinAny = new short[1] ;
      P00Q716_A3647EstTinMes = new byte[1] ;
      P00Q716_A3648EstTinDia = new byte[1] ;
      P00Q716_A1929EstTinNr = new short[1] ;
      A1936BarSerTin = "" ;
      P00Q717_A396EmprCod = new String[] {""} ;
      P00Q717_A252CliCod = new int[1] ;
      P00Q717_n252CliCod = new boolean[] {false} ;
      P00Q717_A3013CoKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00Q717_n3013CoKgs = new boolean[] {false} ;
      P00Q717_A3061Codia = new byte[1] ;
      P00Q717_A3062CoMes = new byte[1] ;
      P00Q717_A3063CoAny = new short[1] ;
      P00Q717_A3065CoLin = new byte[1] ;
      P00Q717_A3010CoBarCod = new int[1] ;
      P00Q717_A3011CoBarReo = new byte[1] ;
      P00Q717_A3012CoBarPar = new String[] {""} ;
      A3013CoKgs = DecimalUtil.ZERO ;
      A3012CoBarPar = "" ;
      P00Q718_A396EmprCod = new String[] {""} ;
      P00Q718_A252CliCod = new int[1] ;
      P00Q718_n252CliCod = new boolean[] {false} ;
      P00Q718_A2970TiCosteA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00Q718_n2970TiCosteA = new boolean[] {false} ;
      P00Q718_A2954TiDia = new byte[1] ;
      P00Q718_A2955TiMes = new byte[1] ;
      P00Q718_A2956TiAny = new short[1] ;
      P00Q718_A2958TiLin = new byte[1] ;
      P00Q718_A2959TiBarCod = new int[1] ;
      P00Q718_A2960TiBarReo = new byte[1] ;
      P00Q718_A2961TiBarPar = new String[] {""} ;
      A2970TiCosteA = DecimalUtil.ZERO ;
      A2961TiBarPar = "" ;
      P00Q719_A396EmprCod = new String[] {""} ;
      P00Q719_A252CliCod = new int[1] ;
      P00Q719_n252CliCod = new boolean[] {false} ;
      P00Q719_A5239MezFecPda = new java.util.Date[] {GXutil.nullDate()} ;
      P00Q719_n5239MezFecPda = new boolean[] {false} ;
      P00Q719_A5234MezCod = new String[] {""} ;
      A5239MezFecPda = GXutil.nullDate() ;
      A5234MezCod = "" ;
      P00Q720_A396EmprCod = new String[] {""} ;
      P00Q720_A252CliCod = new int[1] ;
      P00Q720_n252CliCod = new boolean[] {false} ;
      P00Q720_A5812MMezFecPda = new java.util.Date[] {GXutil.nullDate()} ;
      P00Q720_n5812MMezFecPda = new boolean[] {false} ;
      P00Q720_A5809MMezCod = new String[] {""} ;
      A5812MMezFecPda = GXutil.nullDate() ;
      A5809MMezCod = "" ;
      P00Q721_A396EmprCod = new String[] {""} ;
      P00Q721_A252CliCod = new int[1] ;
      P00Q721_n252CliCod = new boolean[] {false} ;
      P00Q721_A7548Alb_NFisC = new String[] {""} ;
      A7548Alb_NFisC = "" ;
      P00Q722_A396EmprCod = new String[] {""} ;
      P00Q722_A252CliCod = new int[1] ;
      P00Q722_n252CliCod = new boolean[] {false} ;
      P00Q722_A2422OpeAntKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00Q722_n2422OpeAntKgm = new boolean[] {false} ;
      P00Q722_A2420OpeAntCod = new int[1] ;
      A2422OpeAntKgm = DecimalUtil.ZERO ;
      P00Q723_A396EmprCod = new String[] {""} ;
      P00Q723_A252CliCod = new int[1] ;
      P00Q723_n252CliCod = new boolean[] {false} ;
      P00Q723_A7846Int_ColNn = new int[1] ;
      P00Q723_n7846Int_ColNn = new boolean[] {false} ;
      P00Q723_A7843Int_Num = new int[1] ;
      P00Q724_A396EmprCod = new String[] {""} ;
      P00Q724_A252CliCod = new int[1] ;
      P00Q724_n252CliCod = new boolean[] {false} ;
      P00Q724_A5132PagImpo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00Q724_n5132PagImpo = new boolean[] {false} ;
      P00Q724_A5130PagIden = new int[1] ;
      A5132PagImpo = DecimalUtil.ZERO ;
      P00Q725_A396EmprCod = new String[] {""} ;
      P00Q725_A252CliCod = new int[1] ;
      P00Q725_n252CliCod = new boolean[] {false} ;
      P00Q725_A8405PMDKgmMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00Q725_A8403PMDLin = new short[1] ;
      A8405PMDKgmMax = DecimalUtil.ZERO ;
      P00Q726_A396EmprCod = new String[] {""} ;
      P00Q726_A252CliCod = new int[1] ;
      P00Q726_n252CliCod = new boolean[] {false} ;
      P00Q726_A470FasSumTin = new String[] {""} ;
      P00Q726_n470FasSumTin = new boolean[] {false} ;
      P00Q726_A457FasCod = new String[] {""} ;
      A470FasSumTin = "" ;
      A457FasCod = "" ;
      P00Q727_A396EmprCod = new String[] {""} ;
      P00Q727_A252CliCod = new int[1] ;
      P00Q727_n252CliCod = new boolean[] {false} ;
      P00Q727_A5428FasPreCod = new String[] {""} ;
      A5428FasPreCod = "" ;
      P00Q728_A396EmprCod = new String[] {""} ;
      P00Q728_A252CliCod = new int[1] ;
      P00Q728_n252CliCod = new boolean[] {false} ;
      P00Q728_A3321CliPreKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00Q728_n3321CliPreKgs = new boolean[] {false} ;
      P00Q728_A3320CliLimKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A3321CliPreKgs = DecimalUtil.ZERO ;
      A3320CliLimKgs = DecimalUtil.ZERO ;
      P00Q729_A396EmprCod = new String[] {""} ;
      P00Q729_A252CliCod = new int[1] ;
      P00Q729_n252CliCod = new boolean[] {false} ;
      P00Q729_A5448ProForPK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00Q729_n5448ProForPK = new boolean[] {false} ;
      P00Q729_A5452P_ForCod = new String[] {""} ;
      A5448ProForPK = DecimalUtil.ZERO ;
      A5452P_ForCod = "" ;
      P00Q730_A396EmprCod = new String[] {""} ;
      P00Q730_A252CliCod = new int[1] ;
      P00Q730_n252CliCod = new boolean[] {false} ;
      P00Q730_A8521PreTAICod = new short[1] ;
      P00Q731_A396EmprCod = new String[] {""} ;
      P00Q731_A252CliCod = new int[1] ;
      P00Q731_n252CliCod = new boolean[] {false} ;
      P00Q731_A8392PMDDsc = new String[] {""} ;
      P00Q731_n8392PMDDsc = new boolean[] {false} ;
      P00Q731_A8391PMDCod = new short[1] ;
      A8392PMDDsc = "" ;
      P00Q732_A396EmprCod = new String[] {""} ;
      P00Q732_A252CliCod = new int[1] ;
      P00Q732_n252CliCod = new boolean[] {false} ;
      P00Q732_A7788Prt_Artcod = new String[] {""} ;
      P00Q732_A7801Prt_NumPnt = new short[1] ;
      A7788Prt_Artcod = "" ;
      P00Q733_A396EmprCod = new String[] {""} ;
      P00Q733_A252CliCod = new int[1] ;
      P00Q733_n252CliCod = new boolean[] {false} ;
      P00Q733_A6342C_RecMatDs = new String[] {""} ;
      P00Q733_n6342C_RecMatDs = new boolean[] {false} ;
      P00Q733_A6319C_Barcod = new int[1] ;
      P00Q733_A6320C_Barcodre = new byte[1] ;
      P00Q733_A6321C_Barcodpa = new String[] {""} ;
      P00Q733_A6322C_Reclinma = new short[1] ;
      A6342C_RecMatDs = "" ;
      A6321C_Barcodpa = "" ;
      P00Q734_A396EmprCod = new String[] {""} ;
      P00Q734_A252CliCod = new int[1] ;
      P00Q734_n252CliCod = new boolean[] {false} ;
      P00Q734_A6935Lb_rccorc = new String[] {""} ;
      P00Q734_n6935Lb_rccorc = new boolean[] {false} ;
      P00Q734_A6930Lb_rclin = new int[1] ;
      A6935Lb_rccorc = "" ;
      P00Q735_A396EmprCod = new String[] {""} ;
      P00Q735_A252CliCod = new int[1] ;
      P00Q735_n252CliCod = new boolean[] {false} ;
      P00Q735_A7569Su_AlbLocC = new byte[1] ;
      P00Q735_n7569Su_AlbLocC = new boolean[] {false} ;
      P00Q735_A7566Su_AlbCod = new long[1] ;
      P00Q736_A396EmprCod = new String[] {""} ;
      P00Q736_A252CliCod = new int[1] ;
      P00Q736_n252CliCod = new boolean[] {false} ;
      P00Q736_A6856Tex_Estado = new byte[1] ;
      P00Q736_n6856Tex_Estado = new boolean[] {false} ;
      P00Q736_A6850Tex_NPed = new int[1] ;
      P00Q737_A396EmprCod = new String[] {""} ;
      P00Q737_A252CliCod = new int[1] ;
      P00Q737_n252CliCod = new boolean[] {false} ;
      P00Q737_A29Com_lin = new int[1] ;
      P00Q738_A396EmprCod = new String[] {""} ;
      P00Q738_A252CliCod = new int[1] ;
      P00Q738_n252CliCod = new boolean[] {false} ;
      P00Q738_A4187WebUsuEmai = new String[] {""} ;
      P00Q738_n4187WebUsuEmai = new boolean[] {false} ;
      P00Q738_A4185WEBUSU = new String[] {""} ;
      A4187WebUsuEmai = "" ;
      A4185WEBUSU = "" ;
      P00Q739_A396EmprCod = new String[] {""} ;
      P00Q739_A252CliCod = new int[1] ;
      P00Q739_n252CliCod = new boolean[] {false} ;
      P00Q739_A4079WEBDISCOD = new String[] {""} ;
      A4079WEBDISCOD = "" ;
      P00Q740_A396EmprCod = new String[] {""} ;
      P00Q740_A252CliCod = new int[1] ;
      P00Q740_n252CliCod = new boolean[] {false} ;
      P00Q740_A4201XHDRDisCli = new String[] {""} ;
      P00Q740_n4201XHDRDisCli = new boolean[] {false} ;
      P00Q740_A4198XHDRCod = new int[1] ;
      P00Q740_A4199XHDRReo = new byte[1] ;
      P00Q740_A4200XHDRPar = new String[] {""} ;
      A4201XHDRDisCli = "" ;
      A4200XHDRPar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbusprm__default(),
         new Object[] {
             new Object[] {
            P00Q72_A396EmprCod, P00Q72_A252CliCod, P00Q72_A4196DisCliCod
            }
            , new Object[] {
            P00Q73_A396EmprCod, P00Q73_A252CliCod, P00Q73_A5536Lb_ColNom, P00Q73_A5532Lb_numero
            }
            , new Object[] {
            P00Q74_A396EmprCod, P00Q74_A252CliCod, P00Q74_n252CliCod, P00Q74_A4624EnsLHorR, P00Q74_n4624EnsLHorR, P00Q74_A4618EnsLCod
            }
            , new Object[] {
            P00Q75_A396EmprCod, P00Q75_A252CliCod, P00Q75_n252CliCod, P00Q75_A8177Bdg_Artc, P00Q75_n8177Bdg_Artc, P00Q75_A8174Bdg_hdr, P00Q75_A8175Bdg_Hdrr, P00Q75_A8176Bdg_Hdrp
            }
            , new Object[] {
            P00Q76_A396EmprCod, P00Q76_A252CliCod, P00Q76_A9634Est_Any, P00Q76_A9635Est_Mes, P00Q76_A9636Est_Dia, P00Q76_A9630Est_ColA, P00Q76_A9631Est_ColN, P00Q76_A9632Est_Tc
            }
            , new Object[] {
            P00Q77_A396EmprCod, P00Q77_A252CliCod, P00Q77_A5029PreEstFu, P00Q77_n5029PreEstFu, P00Q77_A4718DishCod, P00Q77_A5020TipEstCod, P00Q77_A5022GraCod
            }
            , new Object[] {
            P00Q78_A396EmprCod, P00Q78_A252CliCod, P00Q78_A3665FacProTar, P00Q78_A3661FacProAny, P00Q78_A3662FacProSer, P00Q78_A3663FacProInt, P00Q78_A3664FacProTip
            }
            , new Object[] {
            P00Q79_A396EmprCod, P00Q79_A252CliCod, P00Q79_A4589FFProCod
            }
            , new Object[] {
            P00Q710_A396EmprCod, P00Q710_A252CliCod, P00Q710_A5346GasColHoj, P00Q710_n5346GasColHoj, P00Q710_A5344GasColNum
            }
            , new Object[] {
            P00Q711_A396EmprCod, P00Q711_A252CliCod, P00Q711_n252CliCod, P00Q711_A509HbaColNom, P00Q711_n509HbaColNom, P00Q711_A506HbaBarCod, P00Q711_A508HbaBarReo, P00Q711_A507HbaBarPar
            }
            , new Object[] {
            P00Q712_A396EmprCod, P00Q712_A252CliCod, P00Q712_A2903HMaPrdNor, P00Q712_n2903HMaPrdNor, P00Q712_A2891HMaForSer, P00Q712_A2892HMaForCNom, P00Q712_A2893HMaForCNum, P00Q712_A2894HMaTipCCod, P00Q712_A2895HMaForNumC, P00Q712_A2897HMaColLin,
            P00Q712_A2896HMaFec, P00Q712_A2907HmaLin
            }
            , new Object[] {
            P00Q713_A396EmprCod, P00Q713_A252CliCod, P00Q713_n252CliCod, P00Q713_A4518HreBarDsc, P00Q713_n4518HreBarDsc, P00Q713_A4492HreBarCod, P00Q713_A4493HreBarReo, P00Q713_A4494HreBarPar, P00Q713_A4495HreNumCie
            }
            , new Object[] {
            P00Q714_A396EmprCod, P00Q714_A252CliCod, P00Q714_n252CliCod, P00Q714_A546HisColNom, P00Q714_n546HisColNom, P00Q714_A539HisBarCod, P00Q714_A545HisCodReo, P00Q714_A544HisCodPar, P00Q714_A833TipDefCod
            }
            , new Object[] {
            P00Q715_A5064Hl_causa, P00Q715_n5064Hl_causa, P00Q715_A396EmprCod, P00Q715_A252CliCod, P00Q715_n252CliCod, P00Q715_A5059Hl_hdr, P00Q715_A5060Hl_hdrr, P00Q715_A5061Hl_hdrp
            }
            , new Object[] {
            P00Q716_A396EmprCod, P00Q716_A252CliCod, P00Q716_A1936BarSerTin, P00Q716_n1936BarSerTin, P00Q716_A3646EstTinAny, P00Q716_A3647EstTinMes, P00Q716_A3648EstTinDia, P00Q716_A1929EstTinNr
            }
            , new Object[] {
            P00Q717_A396EmprCod, P00Q717_A252CliCod, P00Q717_n252CliCod, P00Q717_A3013CoKgs, P00Q717_n3013CoKgs, P00Q717_A3061Codia, P00Q717_A3062CoMes, P00Q717_A3063CoAny, P00Q717_A3065CoLin, P00Q717_A3010CoBarCod,
            P00Q717_A3011CoBarReo, P00Q717_A3012CoBarPar
            }
            , new Object[] {
            P00Q718_A396EmprCod, P00Q718_A252CliCod, P00Q718_n252CliCod, P00Q718_A2970TiCosteA, P00Q718_n2970TiCosteA, P00Q718_A2954TiDia, P00Q718_A2955TiMes, P00Q718_A2956TiAny, P00Q718_A2958TiLin, P00Q718_A2959TiBarCod,
            P00Q718_A2960TiBarReo, P00Q718_A2961TiBarPar
            }
            , new Object[] {
            P00Q719_A396EmprCod, P00Q719_A252CliCod, P00Q719_A5239MezFecPda, P00Q719_n5239MezFecPda, P00Q719_A5234MezCod
            }
            , new Object[] {
            P00Q720_A396EmprCod, P00Q720_A252CliCod, P00Q720_A5812MMezFecPda, P00Q720_n5812MMezFecPda, P00Q720_A5809MMezCod
            }
            , new Object[] {
            P00Q721_A396EmprCod, P00Q721_A252CliCod, P00Q721_A7548Alb_NFisC
            }
            , new Object[] {
            P00Q722_A396EmprCod, P00Q722_A252CliCod, P00Q722_n252CliCod, P00Q722_A2422OpeAntKgm, P00Q722_n2422OpeAntKgm, P00Q722_A2420OpeAntCod
            }
            , new Object[] {
            P00Q723_A396EmprCod, P00Q723_A252CliCod, P00Q723_n252CliCod, P00Q723_A7846Int_ColNn, P00Q723_n7846Int_ColNn, P00Q723_A7843Int_Num
            }
            , new Object[] {
            P00Q724_A396EmprCod, P00Q724_A252CliCod, P00Q724_n252CliCod, P00Q724_A5132PagImpo, P00Q724_n5132PagImpo, P00Q724_A5130PagIden
            }
            , new Object[] {
            P00Q725_A396EmprCod, P00Q725_A252CliCod, P00Q725_A8405PMDKgmMax, P00Q725_A8403PMDLin
            }
            , new Object[] {
            P00Q726_A396EmprCod, P00Q726_A252CliCod, P00Q726_A470FasSumTin, P00Q726_n470FasSumTin, P00Q726_A457FasCod
            }
            , new Object[] {
            P00Q727_A396EmprCod, P00Q727_A252CliCod, P00Q727_A5428FasPreCod
            }
            , new Object[] {
            P00Q728_A396EmprCod, P00Q728_A252CliCod, P00Q728_A3321CliPreKgs, P00Q728_n3321CliPreKgs, P00Q728_A3320CliLimKgs
            }
            , new Object[] {
            P00Q729_A396EmprCod, P00Q729_A252CliCod, P00Q729_A5448ProForPK, P00Q729_n5448ProForPK, P00Q729_A5452P_ForCod
            }
            , new Object[] {
            P00Q730_A396EmprCod, P00Q730_A252CliCod, P00Q730_A8521PreTAICod
            }
            , new Object[] {
            P00Q731_A396EmprCod, P00Q731_A252CliCod, P00Q731_A8392PMDDsc, P00Q731_n8392PMDDsc, P00Q731_A8391PMDCod
            }
            , new Object[] {
            P00Q732_A396EmprCod, P00Q732_A252CliCod, P00Q732_A7788Prt_Artcod, P00Q732_A7801Prt_NumPnt
            }
            , new Object[] {
            P00Q733_A396EmprCod, P00Q733_A252CliCod, P00Q733_n252CliCod, P00Q733_A6342C_RecMatDs, P00Q733_n6342C_RecMatDs, P00Q733_A6319C_Barcod, P00Q733_A6320C_Barcodre, P00Q733_A6321C_Barcodpa, P00Q733_A6322C_Reclinma
            }
            , new Object[] {
            P00Q734_A396EmprCod, P00Q734_A252CliCod, P00Q734_A6935Lb_rccorc, P00Q734_n6935Lb_rccorc, P00Q734_A6930Lb_rclin
            }
            , new Object[] {
            P00Q735_A396EmprCod, P00Q735_A252CliCod, P00Q735_n252CliCod, P00Q735_A7569Su_AlbLocC, P00Q735_n7569Su_AlbLocC, P00Q735_A7566Su_AlbCod
            }
            , new Object[] {
            P00Q736_A396EmprCod, P00Q736_A252CliCod, P00Q736_n252CliCod, P00Q736_A6856Tex_Estado, P00Q736_n6856Tex_Estado, P00Q736_A6850Tex_NPed
            }
            , new Object[] {
            P00Q737_A396EmprCod, P00Q737_A252CliCod, P00Q737_A29Com_lin
            }
            , new Object[] {
            P00Q738_A396EmprCod, P00Q738_A252CliCod, P00Q738_n252CliCod, P00Q738_A4187WebUsuEmai, P00Q738_n4187WebUsuEmai, P00Q738_A4185WEBUSU
            }
            , new Object[] {
            P00Q739_A396EmprCod, P00Q739_A252CliCod, P00Q739_A4079WEBDISCOD
            }
            , new Object[] {
            P00Q740_A396EmprCod, P00Q740_A252CliCod, P00Q740_n252CliCod, P00Q740_A4201XHDRDisCli, P00Q740_n4201XHDRDisCli, P00Q740_A4198XHDRCod, P00Q740_A4199XHDRReo, P00Q740_A4200XHDRPar
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV13Err_tab ;
   private byte A8175Bdg_Hdrr ;
   private byte A9635Est_Mes ;
   private byte A9636Est_Dia ;
   private byte A9632Est_Tc ;
   private byte A5020TipEstCod ;
   private byte A5022GraCod ;
   private byte A3663FacProInt ;
   private byte A3664FacProTip ;
   private byte A508HbaBarReo ;
   private byte A2894HMaTipCCod ;
   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private byte A545HisCodReo ;
   private byte A5060Hl_hdrr ;
   private byte A3647EstTinMes ;
   private byte A3648EstTinDia ;
   private byte A3061Codia ;
   private byte A3062CoMes ;
   private byte A3065CoLin ;
   private byte A3011CoBarReo ;
   private byte A2954TiDia ;
   private byte A2955TiMes ;
   private byte A2958TiLin ;
   private byte A2960TiBarReo ;
   private byte A6320C_Barcodre ;
   private byte A7569Su_AlbLocC ;
   private byte A6856Tex_Estado ;
   private byte A4199XHDRReo ;
   private short A9634Est_Any ;
   private short A3665FacProTar ;
   private short A3661FacProAny ;
   private short A5346GasColHoj ;
   private short A2903HMaPrdNor ;
   private short A2897HMaColLin ;
   private short A2907HmaLin ;
   private short A833TipDefCod ;
   private short A3646EstTinAny ;
   private short A1929EstTinNr ;
   private short A3063CoAny ;
   private short A2956TiAny ;
   private short A8403PMDLin ;
   private short A8521PreTAICod ;
   private short A8391PMDCod ;
   private short A7801Prt_NumPnt ;
   private short A6322C_Reclinma ;
   private short Gx_err ;
   private int AV12Clicod ;
   private int A252CliCod ;
   private int A5532Lb_numero ;
   private int A4618EnsLCod ;
   private int A8174Bdg_hdr ;
   private int A9631Est_ColN ;
   private int A5344GasColNum ;
   private int A506HbaBarCod ;
   private int A2893HMaForCNum ;
   private int A2895HMaForNumC ;
   private int A4492HreBarCod ;
   private int A539HisBarCod ;
   private int A5059Hl_hdr ;
   private int A3010CoBarCod ;
   private int A2959TiBarCod ;
   private int A2420OpeAntCod ;
   private int A7846Int_ColNn ;
   private int A7843Int_Num ;
   private int A5130PagIden ;
   private int A6319C_Barcod ;
   private int A6930Lb_rclin ;
   private int A6850Tex_NPed ;
   private int A29Com_lin ;
   private int A4198XHDRCod ;
   private long A7566Su_AlbCod ;
   private java.math.BigDecimal A3013CoKgs ;
   private java.math.BigDecimal A2970TiCosteA ;
   private java.math.BigDecimal A2422OpeAntKgm ;
   private java.math.BigDecimal A5132PagImpo ;
   private java.math.BigDecimal A8405PMDKgmMax ;
   private java.math.BigDecimal A3321CliPreKgs ;
   private java.math.BigDecimal A3320CliLimKgs ;
   private java.math.BigDecimal A5448ProForPK ;
   private String A396EmprCod ;
   private String Gx_msg ;
   private String AV14Tabla ;
   private String scmdbuf ;
   private String A4196DisCliCod ;
   private String A5536Lb_ColNom ;
   private String A8177Bdg_Artc ;
   private String A8176Bdg_Hdrp ;
   private String A9630Est_ColA ;
   private String A4718DishCod ;
   private String A3662FacProSer ;
   private String A4589FFProCod ;
   private String A509HbaColNom ;
   private String A507HbaBarPar ;
   private String A2891HMaForSer ;
   private String A2892HMaForCNom ;
   private String A4518HreBarDsc ;
   private String A4494HreBarPar ;
   private String A546HisColNom ;
   private String A544HisCodPar ;
   private String A5061Hl_hdrp ;
   private String A1936BarSerTin ;
   private String A3012CoBarPar ;
   private String A2961TiBarPar ;
   private String A5234MezCod ;
   private String A5809MMezCod ;
   private String A7548Alb_NFisC ;
   private String A470FasSumTin ;
   private String A457FasCod ;
   private String A5428FasPreCod ;
   private String A5452P_ForCod ;
   private String A8392PMDDsc ;
   private String A7788Prt_Artcod ;
   private String A6342C_RecMatDs ;
   private String A6321C_Barcodpa ;
   private String A6935Lb_rccorc ;
   private String A4187WebUsuEmai ;
   private String A4185WEBUSU ;
   private String A4079WEBDISCOD ;
   private String A4201XHDRDisCli ;
   private String A4200XHDRPar ;
   private java.util.Date A4624EnsLHorR ;
   private java.util.Date A5029PreEstFu ;
   private java.util.Date A2896HMaFec ;
   private java.util.Date A5239MezFecPda ;
   private java.util.Date A5812MMezFecPda ;
   private boolean n252CliCod ;
   private boolean returnInSub ;
   private boolean n4624EnsLHorR ;
   private boolean n8177Bdg_Artc ;
   private boolean n5029PreEstFu ;
   private boolean n5346GasColHoj ;
   private boolean n509HbaColNom ;
   private boolean n2903HMaPrdNor ;
   private boolean n4518HreBarDsc ;
   private boolean n546HisColNom ;
   private boolean n5064Hl_causa ;
   private boolean n1936BarSerTin ;
   private boolean n3013CoKgs ;
   private boolean n2970TiCosteA ;
   private boolean n5239MezFecPda ;
   private boolean n5812MMezFecPda ;
   private boolean n2422OpeAntKgm ;
   private boolean n7846Int_ColNn ;
   private boolean n5132PagImpo ;
   private boolean n470FasSumTin ;
   private boolean n3321CliPreKgs ;
   private boolean n5448ProForPK ;
   private boolean n8392PMDDsc ;
   private boolean n6342C_RecMatDs ;
   private boolean n6935Lb_rccorc ;
   private boolean n7569Su_AlbLocC ;
   private boolean n6856Tex_Estado ;
   private boolean n4187WebUsuEmai ;
   private boolean n4201XHDRDisCli ;
   private String A5064Hl_causa ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P00Q72_A396EmprCod ;
   private int[] P00Q72_A252CliCod ;
   private boolean[] P00Q72_n252CliCod ;
   private String[] P00Q72_A4196DisCliCod ;
   private String[] P00Q73_A396EmprCod ;
   private int[] P00Q73_A252CliCod ;
   private boolean[] P00Q73_n252CliCod ;
   private String[] P00Q73_A5536Lb_ColNom ;
   private int[] P00Q73_A5532Lb_numero ;
   private String[] P00Q74_A396EmprCod ;
   private int[] P00Q74_A252CliCod ;
   private boolean[] P00Q74_n252CliCod ;
   private java.util.Date[] P00Q74_A4624EnsLHorR ;
   private boolean[] P00Q74_n4624EnsLHorR ;
   private int[] P00Q74_A4618EnsLCod ;
   private String[] P00Q75_A396EmprCod ;
   private int[] P00Q75_A252CliCod ;
   private boolean[] P00Q75_n252CliCod ;
   private String[] P00Q75_A8177Bdg_Artc ;
   private boolean[] P00Q75_n8177Bdg_Artc ;
   private int[] P00Q75_A8174Bdg_hdr ;
   private byte[] P00Q75_A8175Bdg_Hdrr ;
   private String[] P00Q75_A8176Bdg_Hdrp ;
   private String[] P00Q76_A396EmprCod ;
   private int[] P00Q76_A252CliCod ;
   private boolean[] P00Q76_n252CliCod ;
   private short[] P00Q76_A9634Est_Any ;
   private byte[] P00Q76_A9635Est_Mes ;
   private byte[] P00Q76_A9636Est_Dia ;
   private String[] P00Q76_A9630Est_ColA ;
   private int[] P00Q76_A9631Est_ColN ;
   private byte[] P00Q76_A9632Est_Tc ;
   private String[] P00Q77_A396EmprCod ;
   private int[] P00Q77_A252CliCod ;
   private boolean[] P00Q77_n252CliCod ;
   private java.util.Date[] P00Q77_A5029PreEstFu ;
   private boolean[] P00Q77_n5029PreEstFu ;
   private String[] P00Q77_A4718DishCod ;
   private byte[] P00Q77_A5020TipEstCod ;
   private byte[] P00Q77_A5022GraCod ;
   private String[] P00Q78_A396EmprCod ;
   private int[] P00Q78_A252CliCod ;
   private boolean[] P00Q78_n252CliCod ;
   private short[] P00Q78_A3665FacProTar ;
   private short[] P00Q78_A3661FacProAny ;
   private String[] P00Q78_A3662FacProSer ;
   private byte[] P00Q78_A3663FacProInt ;
   private byte[] P00Q78_A3664FacProTip ;
   private String[] P00Q79_A396EmprCod ;
   private int[] P00Q79_A252CliCod ;
   private boolean[] P00Q79_n252CliCod ;
   private String[] P00Q79_A4589FFProCod ;
   private String[] P00Q710_A396EmprCod ;
   private int[] P00Q710_A252CliCod ;
   private boolean[] P00Q710_n252CliCod ;
   private short[] P00Q710_A5346GasColHoj ;
   private boolean[] P00Q710_n5346GasColHoj ;
   private int[] P00Q710_A5344GasColNum ;
   private String[] P00Q711_A396EmprCod ;
   private int[] P00Q711_A252CliCod ;
   private boolean[] P00Q711_n252CliCod ;
   private String[] P00Q711_A509HbaColNom ;
   private boolean[] P00Q711_n509HbaColNom ;
   private int[] P00Q711_A506HbaBarCod ;
   private byte[] P00Q711_A508HbaBarReo ;
   private String[] P00Q711_A507HbaBarPar ;
   private String[] P00Q712_A396EmprCod ;
   private int[] P00Q712_A252CliCod ;
   private boolean[] P00Q712_n252CliCod ;
   private short[] P00Q712_A2903HMaPrdNor ;
   private boolean[] P00Q712_n2903HMaPrdNor ;
   private String[] P00Q712_A2891HMaForSer ;
   private String[] P00Q712_A2892HMaForCNom ;
   private int[] P00Q712_A2893HMaForCNum ;
   private byte[] P00Q712_A2894HMaTipCCod ;
   private int[] P00Q712_A2895HMaForNumC ;
   private short[] P00Q712_A2897HMaColLin ;
   private java.util.Date[] P00Q712_A2896HMaFec ;
   private short[] P00Q712_A2907HmaLin ;
   private String[] P00Q713_A396EmprCod ;
   private int[] P00Q713_A252CliCod ;
   private boolean[] P00Q713_n252CliCod ;
   private String[] P00Q713_A4518HreBarDsc ;
   private boolean[] P00Q713_n4518HreBarDsc ;
   private int[] P00Q713_A4492HreBarCod ;
   private byte[] P00Q713_A4493HreBarReo ;
   private String[] P00Q713_A4494HreBarPar ;
   private byte[] P00Q713_A4495HreNumCie ;
   private String[] P00Q714_A396EmprCod ;
   private int[] P00Q714_A252CliCod ;
   private boolean[] P00Q714_n252CliCod ;
   private String[] P00Q714_A546HisColNom ;
   private boolean[] P00Q714_n546HisColNom ;
   private int[] P00Q714_A539HisBarCod ;
   private byte[] P00Q714_A545HisCodReo ;
   private String[] P00Q714_A544HisCodPar ;
   private short[] P00Q714_A833TipDefCod ;
   private String[] P00Q715_A5064Hl_causa ;
   private boolean[] P00Q715_n5064Hl_causa ;
   private String[] P00Q715_A396EmprCod ;
   private int[] P00Q715_A252CliCod ;
   private boolean[] P00Q715_n252CliCod ;
   private int[] P00Q715_A5059Hl_hdr ;
   private byte[] P00Q715_A5060Hl_hdrr ;
   private String[] P00Q715_A5061Hl_hdrp ;
   private String[] P00Q716_A396EmprCod ;
   private int[] P00Q716_A252CliCod ;
   private boolean[] P00Q716_n252CliCod ;
   private String[] P00Q716_A1936BarSerTin ;
   private boolean[] P00Q716_n1936BarSerTin ;
   private short[] P00Q716_A3646EstTinAny ;
   private byte[] P00Q716_A3647EstTinMes ;
   private byte[] P00Q716_A3648EstTinDia ;
   private short[] P00Q716_A1929EstTinNr ;
   private String[] P00Q717_A396EmprCod ;
   private int[] P00Q717_A252CliCod ;
   private boolean[] P00Q717_n252CliCod ;
   private java.math.BigDecimal[] P00Q717_A3013CoKgs ;
   private boolean[] P00Q717_n3013CoKgs ;
   private byte[] P00Q717_A3061Codia ;
   private byte[] P00Q717_A3062CoMes ;
   private short[] P00Q717_A3063CoAny ;
   private byte[] P00Q717_A3065CoLin ;
   private int[] P00Q717_A3010CoBarCod ;
   private byte[] P00Q717_A3011CoBarReo ;
   private String[] P00Q717_A3012CoBarPar ;
   private String[] P00Q718_A396EmprCod ;
   private int[] P00Q718_A252CliCod ;
   private boolean[] P00Q718_n252CliCod ;
   private java.math.BigDecimal[] P00Q718_A2970TiCosteA ;
   private boolean[] P00Q718_n2970TiCosteA ;
   private byte[] P00Q718_A2954TiDia ;
   private byte[] P00Q718_A2955TiMes ;
   private short[] P00Q718_A2956TiAny ;
   private byte[] P00Q718_A2958TiLin ;
   private int[] P00Q718_A2959TiBarCod ;
   private byte[] P00Q718_A2960TiBarReo ;
   private String[] P00Q718_A2961TiBarPar ;
   private String[] P00Q719_A396EmprCod ;
   private int[] P00Q719_A252CliCod ;
   private boolean[] P00Q719_n252CliCod ;
   private java.util.Date[] P00Q719_A5239MezFecPda ;
   private boolean[] P00Q719_n5239MezFecPda ;
   private String[] P00Q719_A5234MezCod ;
   private String[] P00Q720_A396EmprCod ;
   private int[] P00Q720_A252CliCod ;
   private boolean[] P00Q720_n252CliCod ;
   private java.util.Date[] P00Q720_A5812MMezFecPda ;
   private boolean[] P00Q720_n5812MMezFecPda ;
   private String[] P00Q720_A5809MMezCod ;
   private String[] P00Q721_A396EmprCod ;
   private int[] P00Q721_A252CliCod ;
   private boolean[] P00Q721_n252CliCod ;
   private String[] P00Q721_A7548Alb_NFisC ;
   private String[] P00Q722_A396EmprCod ;
   private int[] P00Q722_A252CliCod ;
   private boolean[] P00Q722_n252CliCod ;
   private java.math.BigDecimal[] P00Q722_A2422OpeAntKgm ;
   private boolean[] P00Q722_n2422OpeAntKgm ;
   private int[] P00Q722_A2420OpeAntCod ;
   private String[] P00Q723_A396EmprCod ;
   private int[] P00Q723_A252CliCod ;
   private boolean[] P00Q723_n252CliCod ;
   private int[] P00Q723_A7846Int_ColNn ;
   private boolean[] P00Q723_n7846Int_ColNn ;
   private int[] P00Q723_A7843Int_Num ;
   private String[] P00Q724_A396EmprCod ;
   private int[] P00Q724_A252CliCod ;
   private boolean[] P00Q724_n252CliCod ;
   private java.math.BigDecimal[] P00Q724_A5132PagImpo ;
   private boolean[] P00Q724_n5132PagImpo ;
   private int[] P00Q724_A5130PagIden ;
   private String[] P00Q725_A396EmprCod ;
   private int[] P00Q725_A252CliCod ;
   private boolean[] P00Q725_n252CliCod ;
   private java.math.BigDecimal[] P00Q725_A8405PMDKgmMax ;
   private short[] P00Q725_A8403PMDLin ;
   private String[] P00Q726_A396EmprCod ;
   private int[] P00Q726_A252CliCod ;
   private boolean[] P00Q726_n252CliCod ;
   private String[] P00Q726_A470FasSumTin ;
   private boolean[] P00Q726_n470FasSumTin ;
   private String[] P00Q726_A457FasCod ;
   private String[] P00Q727_A396EmprCod ;
   private int[] P00Q727_A252CliCod ;
   private boolean[] P00Q727_n252CliCod ;
   private String[] P00Q727_A5428FasPreCod ;
   private String[] P00Q728_A396EmprCod ;
   private int[] P00Q728_A252CliCod ;
   private boolean[] P00Q728_n252CliCod ;
   private java.math.BigDecimal[] P00Q728_A3321CliPreKgs ;
   private boolean[] P00Q728_n3321CliPreKgs ;
   private java.math.BigDecimal[] P00Q728_A3320CliLimKgs ;
   private String[] P00Q729_A396EmprCod ;
   private int[] P00Q729_A252CliCod ;
   private boolean[] P00Q729_n252CliCod ;
   private java.math.BigDecimal[] P00Q729_A5448ProForPK ;
   private boolean[] P00Q729_n5448ProForPK ;
   private String[] P00Q729_A5452P_ForCod ;
   private String[] P00Q730_A396EmprCod ;
   private int[] P00Q730_A252CliCod ;
   private boolean[] P00Q730_n252CliCod ;
   private short[] P00Q730_A8521PreTAICod ;
   private String[] P00Q731_A396EmprCod ;
   private int[] P00Q731_A252CliCod ;
   private boolean[] P00Q731_n252CliCod ;
   private String[] P00Q731_A8392PMDDsc ;
   private boolean[] P00Q731_n8392PMDDsc ;
   private short[] P00Q731_A8391PMDCod ;
   private String[] P00Q732_A396EmprCod ;
   private int[] P00Q732_A252CliCod ;
   private boolean[] P00Q732_n252CliCod ;
   private String[] P00Q732_A7788Prt_Artcod ;
   private short[] P00Q732_A7801Prt_NumPnt ;
   private String[] P00Q733_A396EmprCod ;
   private int[] P00Q733_A252CliCod ;
   private boolean[] P00Q733_n252CliCod ;
   private String[] P00Q733_A6342C_RecMatDs ;
   private boolean[] P00Q733_n6342C_RecMatDs ;
   private int[] P00Q733_A6319C_Barcod ;
   private byte[] P00Q733_A6320C_Barcodre ;
   private String[] P00Q733_A6321C_Barcodpa ;
   private short[] P00Q733_A6322C_Reclinma ;
   private String[] P00Q734_A396EmprCod ;
   private int[] P00Q734_A252CliCod ;
   private boolean[] P00Q734_n252CliCod ;
   private String[] P00Q734_A6935Lb_rccorc ;
   private boolean[] P00Q734_n6935Lb_rccorc ;
   private int[] P00Q734_A6930Lb_rclin ;
   private String[] P00Q735_A396EmprCod ;
   private int[] P00Q735_A252CliCod ;
   private boolean[] P00Q735_n252CliCod ;
   private byte[] P00Q735_A7569Su_AlbLocC ;
   private boolean[] P00Q735_n7569Su_AlbLocC ;
   private long[] P00Q735_A7566Su_AlbCod ;
   private String[] P00Q736_A396EmprCod ;
   private int[] P00Q736_A252CliCod ;
   private boolean[] P00Q736_n252CliCod ;
   private byte[] P00Q736_A6856Tex_Estado ;
   private boolean[] P00Q736_n6856Tex_Estado ;
   private int[] P00Q736_A6850Tex_NPed ;
   private String[] P00Q737_A396EmprCod ;
   private int[] P00Q737_A252CliCod ;
   private boolean[] P00Q737_n252CliCod ;
   private int[] P00Q737_A29Com_lin ;
   private String[] P00Q738_A396EmprCod ;
   private int[] P00Q738_A252CliCod ;
   private boolean[] P00Q738_n252CliCod ;
   private String[] P00Q738_A4187WebUsuEmai ;
   private boolean[] P00Q738_n4187WebUsuEmai ;
   private String[] P00Q738_A4185WEBUSU ;
   private String[] P00Q739_A396EmprCod ;
   private int[] P00Q739_A252CliCod ;
   private boolean[] P00Q739_n252CliCod ;
   private String[] P00Q739_A4079WEBDISCOD ;
   private String[] P00Q740_A396EmprCod ;
   private int[] P00Q740_A252CliCod ;
   private boolean[] P00Q740_n252CliCod ;
   private String[] P00Q740_A4201XHDRDisCli ;
   private boolean[] P00Q740_n4201XHDRDisCli ;
   private int[] P00Q740_A4198XHDRCod ;
   private byte[] P00Q740_A4199XHDRReo ;
   private String[] P00Q740_A4200XHDRPar ;
}

final  class pbusprm__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00Q72", "SELECT EmprCod, CliCod, DisCliCod FROM TXPDisCli WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00Q73", "SELECT EmprCod, CliCod, Lb_ColNom, Lb_numero FROM TXPENS001 WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00Q74", "SELECT EmprCod, CliCod, EnsLHorR, EnsLCod FROM TXPENSLAV WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00Q75", "SELECT EmprCod, CliCod, Bdg_Artc, Bdg_hdr, Bdg_Hdrr, Bdg_Hdrp FROM TXPENVBDG WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00Q76", "SELECT EmprCod, CliCod, Est_Any, Est_Mes, Est_Dia, Est_ColA, Est_ColN, Est_Tc FROM TXPESBR00 WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00Q77", "SELECT EmprCod, CliCod, PreEstFu, DishCod, TipEstCod, GraCod FROM TXPESTPRE WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00Q78", "SELECT EmprCod, CliCod, FacProTar, FacProAny, FacProSer, FacProInt, FacProTip FROM TXPFACPRO WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00Q79", "SELECT EmprCod, CliCod, FFProCod FROM TXPFasFCl WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00Q710", "SELECT EmprCod, CliCod, GasColHoj, GasColNum FROM TXPGASCOL WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00Q711", "SELECT EmprCod, CliCod, HbaColNom, HbaBarCod, HbaBarReo, HbaBarPar FROM TXPHISBAR WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00Q712", "SELECT EmprCod, CliCod, HMaPrdNor, HMaForSer, HMaForCNom, HMaForCNum, HMaTipCCod, HMaForNumC, HMaColLin, HMaFec, HmaLin FROM TXPHISMAC WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00Q713", "SELECT EmprCod, CliCod, HreBarDsc, HreBarCod, HreBarReo, HreBarPar, HreNumCie FROM TXPHISREH WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00Q714", "SELECT EmprCod, CliCod, HisColNom, HisBarCod, HisCodReo, HisCodPar, TipDefCod FROM TXPHISREO WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00Q715", "SELECT Hl_causa, EmprCod, CliCod, Hl_hdr, Hl_hdrr, Hl_hdrp FROM TXPHLREOP WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00Q716", "SELECT EmprCod, CliCod, BarSerTin, EstTinAny, EstTinMes, EstTinDia, EstTinNr FROM TXPLCONTI WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00Q717", "SELECT EmprCod, CliCod, CoKgs, Codia, CoMes, CoAny, CoLin, CoBarCod, CoBarReo, CoBarPar FROM TXPLCOSTI WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00Q718", "SELECT EmprCod, CliCod, TiCosteA, TiDia, TiMes, TiAny, TiLin, TiBarCod, TiBarReo, TiBarPar FROM TXPLKGSTI WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00Q719", "SELECT EmprCod, CliCod, MezFecPda, MezCod FROM TXPMEZCLA WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00Q720", "SELECT EmprCod, CliCod, MMezFecPda, MMezCod FROM TXPMEZCLI WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00Q721", "SELECT EmprCod, CliCod, Alb_NFisC FROM TXPNOTRE WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00Q722", "SELECT EmprCod, CliCod, OpeAntKgm, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00Q723", "SELECT EmprCod, CliCod, Int_ColNn, Int_Num FROM TXPOTINT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00Q724", "SELECT EmprCod, CliCod, PagImpo, PagIden FROM TXPPAGCLI WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00Q725", "SELECT EmprCod, CliCod, PMDKgmMax, PMDLin FROM TXPPenMD WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00Q726", "SELECT EmprCod, CliCod, FasSumTin, FasCod FROM TXPPREFAS WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00Q727", "SELECT EmprCod, CliCod, FasPreCod FROM TXPPREFSP WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00Q728", "SELECT EmprCod, CliCod, CliPreKgs, CliLimKgs FROM TXPPREKIL WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00Q729", "SELECT EmprCod, CliCod, ProForPK, P_ForCod FROM TXPPREQL WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00Q730", "SELECT EmprCod, CliCod, PreTAICod FROM TXPPRETAI WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00Q731", "SELECT EmprCod, CliCod, PMDDsc, PMDCod FROM TXPProMD WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00Q732", "SELECT EmprCod, CliCod, Prt_Artcod, Prt_NumPnt FROM TXPPZASPT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00Q733", "SELECT EmprCod, CliCod, C_RecMatDs, C_Barcod, C_Barcodre, C_Barcodpa, C_Reclinma FROM TXPRECMA1 WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00Q734", "SELECT EmprCod, CliCod, Lb_rccorc, Lb_rclin FROM TXPREGCOR WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00Q735", "SELECT EmprCod, CliCod, Su_AlbLocC, Su_AlbCod FROM TXPREMLAV WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00Q736", "SELECT EmprCod, CliCod, Tex_Estado, Tex_NPed FROM TXPTEX000 WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00Q737", "SELECT EmprCod, CliCod, Com_lin FROM TXPVISCLI WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00Q738", "SELECT EMPRCOD, CLICOD, WEBUSUEMAI, WEBUSU FROM TXPWEBUSU WHERE EMPRCOD = ? and CLICOD = ? ORDER BY EMPRCOD, CLICOD ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00Q739", "SELECT EmprCod, CliCod, WEBDISCOD FROM TXPWebDis WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00Q740", "SELECT EmprCod, CliCod, XHDRDisCli, XHDRCod, XHDRReo, XHDRPar FROM TXPXHDR WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = GXutil.resetDate(rslt.getGXDateTime(3));
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 12);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 13);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 16);
               ((String[]) buf[5])[0] = rslt.getString(5, 13);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(10);
               ((short[]) buf[11])[0] = rslt.getShort(11);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 26);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 13);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               ((short[]) buf[8])[0] = rslt.getShort(7);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(4);
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(4);
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 20);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 20);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 8);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               return;
      }
      getresults30( cursor, rslt, buf) ;
   }

   public void getresults30( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               ((short[]) buf[8])[0] = rslt.getShort(7);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((long[]) buf[5])[0] = rslt.getLong(4);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 128);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 10);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 8);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
      setparameters30( cursor, stmt, parms) ;
   }

   public void setparameters30( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

