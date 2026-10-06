package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apregcor3 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apregcor3 pgm = new apregcor3 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apregcor3( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apregcor3.class ), "" );
   }

   public apregcor3( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( httpContext.getMessage( "Procesando clientes.....", "") );
      /* Using cursor P02PI2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P02PI2_A252CliCod[0] ;
         A396EmprCod = P02PI2_A396EmprCod[0] ;
         A6932Lb_Linurc = P02PI2_A6932Lb_Linurc[0] ;
         n6932Lb_Linurc = P02PI2_n6932Lb_Linurc[0] ;
         AV11LB_LINURC = 0 ;
         AV12Clicod = A252CliCod ;
         AV13Emprcod = A396EmprCod ;
         Gx_msg = httpContext.getMessage( "Procesando Cliente =", "") + GXutil.str( A252CliCod, 6, 0) ;
         System.out.println( Gx_msg );
         /* Execute user subroutine: 'REGCOR' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         A6932Lb_Linurc = AV11LB_LINURC ;
         n6932Lb_Linurc = false ;
         /* Using cursor P02PI3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n6932Lb_Linurc), Integer.valueOf(A6932Lb_Linurc), A396EmprCod, Integer.valueOf(A252CliCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIENT");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      System.out.println( httpContext.getMessage( "Fin Procesando clientes.....", "") );
      cleanup();
   }

   public void S111( )
   {
      /* 'REGCOR' Routine */
      returnInSub = false ;
      /* Using cursor P02PI4 */
      pr_default.execute(2, new Object[] {AV13Emprcod, Integer.valueOf(AV12Clicod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A5540Lb_Cartaz = P02PI4_A5540Lb_Cartaz[0] ;
         A5538Lb_ColNomC = P02PI4_A5538Lb_ColNomC[0] ;
         A5539Lb_ColNumC = P02PI4_A5539Lb_ColNumC[0] ;
         A5536Lb_ColNom = P02PI4_A5536Lb_ColNom[0] ;
         A5537Lb_ColNum = P02PI4_A5537Lb_ColNum[0] ;
         A6653Lb_Tra1 = P02PI4_A6653Lb_Tra1[0] ;
         A6655Lb_Tra2 = P02PI4_A6655Lb_Tra2[0] ;
         A6657Lb_Tra3 = P02PI4_A6657Lb_Tra3[0] ;
         A6842Lb_Tra4 = P02PI4_A6842Lb_Tra4[0] ;
         A6844Lb_Tra5 = P02PI4_A6844Lb_Tra5[0] ;
         A6846Lb_Tra6 = P02PI4_A6846Lb_Tra6[0] ;
         A6654Lb_TraP1 = P02PI4_A6654Lb_TraP1[0] ;
         A6656Lb_TraP2 = P02PI4_A6656Lb_TraP2[0] ;
         A6658Lb_TraP3 = P02PI4_A6658Lb_TraP3[0] ;
         A6843Lb_TraP4 = P02PI4_A6843Lb_TraP4[0] ;
         A6845Lb_TraP5 = P02PI4_A6845Lb_TraP5[0] ;
         A6847Lb_TraP6 = P02PI4_A6847Lb_TraP6[0] ;
         A831TipColCod = P02PI4_A831TipColCod[0] ;
         n831TipColCod = P02PI4_n831TipColCod[0] ;
         A5541Lb_FechaE = P02PI4_A5541Lb_FechaE[0] ;
         A5532Lb_numero = P02PI4_A5532Lb_numero[0] ;
         A396EmprCod = P02PI4_A396EmprCod[0] ;
         A252CliCod = P02PI4_A252CliCod[0] ;
         W396EmprCod = A396EmprCod ;
         W252CliCod = A252CliCod ;
         AV14Lb_rcopenv = " " ;
         AV19Lb_rcopnap = " " ;
         /* Using cursor P02PI5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A5567Lb_FechaEn = P02PI5_A5567Lb_FechaEn[0] ;
            A5563Lb_FechaR = P02PI5_A5563Lb_FechaR[0] ;
            A6631Lb_ProvDef = P02PI5_A6631Lb_ProvDef[0] ;
            A6461Lb_FecNoa1 = P02PI5_A6461Lb_FecNoa1[0] ;
            A5555Lb_opcion = P02PI5_A5555Lb_opcion[0] ;
            if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A5567Lb_FechaEn)) )
            {
               if ( GXutil.strcmp(AV14Lb_rcopenv, " ") == 0 )
               {
                  AV14Lb_rcopenv = GXutil.trim( A5555Lb_opcion) + "+" ;
               }
               else
               {
                  AV14Lb_rcopenv += GXutil.concat( A5555Lb_opcion, "+", "") ;
               }
            }
            AV15LB_FECHAEN = GXutil.nullDate() ;
            if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A5567Lb_FechaEn)) )
            {
               AV15LB_FECHAEN = A5567Lb_FechaEn ;
            }
            AV16LB_FECHAR = GXutil.nullDate() ;
            if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A5563Lb_FechaR)) )
            {
               AV16LB_FECHAR = A5563Lb_FechaR ;
            }
            AV17LB_RCOPAPR = " " ;
            if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A5563Lb_FechaR)) )
            {
               AV17LB_RCOPAPR = A5555Lb_opcion ;
               AV20Lb_rcProDe = A6631Lb_ProvDef ;
            }
            AV18LB_FECNOA1 = GXutil.nullDate() ;
            if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A6461Lb_FecNoa1)) )
            {
               AV18LB_FECNOA1 = A6461Lb_FecNoa1 ;
               if ( GXutil.strcmp(AV19Lb_rcopnap, " ") == 0 )
               {
                  AV19Lb_rcopnap = GXutil.trim( A5555Lb_opcion) + "+" ;
               }
               else
               {
                  AV19Lb_rcopnap += GXutil.concat( A5555Lb_opcion, "+", "") ;
               }
            }
            pr_default.readNext(3);
         }
         pr_default.close(3);
         AV11LB_LINURC = (int)(AV11LB_LINURC+1) ;
         /*
            INSERT RECORD ON TABLE TXPREGCOR

         */
         W396EmprCod = A396EmprCod ;
         W252CliCod = A252CliCod ;
         A252CliCod = AV12Clicod ;
         A6930Lb_rclin = AV11LB_LINURC ;
         A6933Lb_rcnens = A5532Lb_numero ;
         n6933Lb_rcnens = false ;
         AV21Ceros6 = "000000" ;
         AV22Cartaz_6 = GXutil.substring( A5540Lb_Cartaz, 1, 6) ;
         AV22Cartaz_6 = GXutil.ltrim( GXutil.rtrim( AV22Cartaz_6)) ;
         AV23Len_Cartaz = (byte)(GXutil.len( AV22Cartaz_6)) ;
         AV23Len_Cartaz = (byte)(6-AV23Len_Cartaz) ;
         AV22Cartaz_6 = GXutil.substring( AV21Ceros6, 1, AV23Len_Cartaz) + AV22Cartaz_6 ;
         A6934Lb_rcncar = AV22Cartaz_6 ;
         n6934Lb_rcncar = false ;
         A6935Lb_rccorc = A5538Lb_ColNomC ;
         n6935Lb_rccorc = false ;
         A6936Lb_rcncorc = A5539Lb_ColNumC ;
         n6936Lb_rcncorc = false ;
         A6937Lb_rccor = A5536Lb_ColNom ;
         n6937Lb_rccor = false ;
         A6938Lb_rcncor = A5537Lb_ColNum ;
         n6938Lb_rcncor = false ;
         A6940Lb_rcp1 = A6653Lb_Tra1 ;
         n6940Lb_rcp1 = false ;
         A6941Lb_rcp2 = A6655Lb_Tra2 ;
         n6941Lb_rcp2 = false ;
         A6942Lb_rcp3 = A6657Lb_Tra3 ;
         n6942Lb_rcp3 = false ;
         A6943Lb_rcp4 = A6842Lb_Tra4 ;
         n6943Lb_rcp4 = false ;
         A6944Lb_rcp5 = A6844Lb_Tra5 ;
         n6944Lb_rcp5 = false ;
         A6945Lb_rcp6 = A6846Lb_Tra6 ;
         n6945Lb_rcp6 = false ;
         A6946Lb_rcpo1 = A6654Lb_TraP1 ;
         n6946Lb_rcpo1 = false ;
         A6947Lb_rcpo2 = A6656Lb_TraP2 ;
         n6947Lb_rcpo2 = false ;
         A6948Lb_rcpo3 = A6658Lb_TraP3 ;
         n6948Lb_rcpo3 = false ;
         A6949Lb_rcpo4 = A6843Lb_TraP4 ;
         n6949Lb_rcpo4 = false ;
         A6950Lb_rcpo5 = A6845Lb_TraP5 ;
         n6950Lb_rcpo5 = false ;
         A6951Lb_rcpo6 = A6847Lb_TraP6 ;
         n6951Lb_rcpo6 = false ;
         A6931Lb_rcobs = " " ;
         n6931Lb_rcobs = false ;
         A6939Lb_rctc = A831TipColCod ;
         n6939Lb_rctc = false ;
         A7009Lb_rcFecEt = A5541Lb_FechaE ;
         n7009Lb_rcFecEt = false ;
         A7015Lb_rcFeNap = AV18LB_FECNOA1 ;
         n7015Lb_rcFeNap = false ;
         A7014Lb_rcOpNap = AV19Lb_rcopnap ;
         n7014Lb_rcOpNap = false ;
         A7013Lb_rcOpApr = AV17LB_RCOPAPR ;
         n7013Lb_rcOpApr = false ;
         A7012Lb_rcOpEnv = AV14Lb_rcopenv ;
         n7012Lb_rcOpEnv = false ;
         A7010Lb_rcFecEn = AV15LB_FECHAEN ;
         n7010Lb_rcFecEn = false ;
         A7011Lb_rcFecRe = AV16LB_FECHAR ;
         n7011Lb_rcFecRe = false ;
         A8022Lb_rcProDe = AV20Lb_rcProDe ;
         n8022Lb_rcProDe = false ;
         /* Using cursor P02PI6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Integer.valueOf(A6930Lb_rclin), Boolean.valueOf(n6931Lb_rcobs), A6931Lb_rcobs, Boolean.valueOf(n6933Lb_rcnens), Integer.valueOf(A6933Lb_rcnens), Boolean.valueOf(n6934Lb_rcncar), A6934Lb_rcncar, Boolean.valueOf(n6935Lb_rccorc), A6935Lb_rccorc, Boolean.valueOf(n6936Lb_rcncorc), Integer.valueOf(A6936Lb_rcncorc), Boolean.valueOf(n6937Lb_rccor), A6937Lb_rccor, Boolean.valueOf(n6938Lb_rcncor), Integer.valueOf(A6938Lb_rcncor), Boolean.valueOf(n6939Lb_rctc), Byte.valueOf(A6939Lb_rctc), Boolean.valueOf(n6940Lb_rcp1), A6940Lb_rcp1, Boolean.valueOf(n6941Lb_rcp2), A6941Lb_rcp2, Boolean.valueOf(n6942Lb_rcp3), A6942Lb_rcp3, Boolean.valueOf(n6943Lb_rcp4), A6943Lb_rcp4, Boolean.valueOf(n6944Lb_rcp5), A6944Lb_rcp5, Boolean.valueOf(n6945Lb_rcp6), A6945Lb_rcp6, Boolean.valueOf(n6946Lb_rcpo1), Short.valueOf(A6946Lb_rcpo1), Boolean.valueOf(n6947Lb_rcpo2), Short.valueOf(A6947Lb_rcpo2), Boolean.valueOf(n6948Lb_rcpo3), Short.valueOf(A6948Lb_rcpo3), Boolean.valueOf(n6949Lb_rcpo4), Short.valueOf(A6949Lb_rcpo4), Boolean.valueOf(n6950Lb_rcpo5), Short.valueOf(A6950Lb_rcpo5), Boolean.valueOf(n6951Lb_rcpo6), Short.valueOf(A6951Lb_rcpo6), Boolean.valueOf(n7009Lb_rcFecEt), A7009Lb_rcFecEt, Boolean.valueOf(n7010Lb_rcFecEn), A7010Lb_rcFecEn, Boolean.valueOf(n7011Lb_rcFecRe), A7011Lb_rcFecRe, Boolean.valueOf(n7012Lb_rcOpEnv), A7012Lb_rcOpEnv, Boolean.valueOf(n7013Lb_rcOpApr), A7013Lb_rcOpApr, Boolean.valueOf(n7014Lb_rcOpNap), A7014Lb_rcOpNap, Boolean.valueOf(n7015Lb_rcFeNap), A7015Lb_rcFeNap, Boolean.valueOf(n8022Lb_rcProDe), A8022Lb_rcProDe});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPREGCOR");
         if ( (pr_default.getStatus(4) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         A396EmprCod = W396EmprCod ;
         A252CliCod = W252CliCod ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         A252CliCod = W252CliCod ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pregcor3.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apregcor3");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P02PI2_A252CliCod = new int[1] ;
      P02PI2_A396EmprCod = new String[] {""} ;
      P02PI2_A6932Lb_Linurc = new int[1] ;
      P02PI2_n6932Lb_Linurc = new boolean[] {false} ;
      A396EmprCod = "" ;
      AV13Emprcod = "" ;
      Gx_msg = "" ;
      P02PI4_A5540Lb_Cartaz = new String[] {""} ;
      P02PI4_A5538Lb_ColNomC = new String[] {""} ;
      P02PI4_A5539Lb_ColNumC = new int[1] ;
      P02PI4_A5536Lb_ColNom = new String[] {""} ;
      P02PI4_A5537Lb_ColNum = new int[1] ;
      P02PI4_A6653Lb_Tra1 = new String[] {""} ;
      P02PI4_A6655Lb_Tra2 = new String[] {""} ;
      P02PI4_A6657Lb_Tra3 = new String[] {""} ;
      P02PI4_A6842Lb_Tra4 = new String[] {""} ;
      P02PI4_A6844Lb_Tra5 = new String[] {""} ;
      P02PI4_A6846Lb_Tra6 = new String[] {""} ;
      P02PI4_A6654Lb_TraP1 = new short[1] ;
      P02PI4_A6656Lb_TraP2 = new short[1] ;
      P02PI4_A6658Lb_TraP3 = new short[1] ;
      P02PI4_A6843Lb_TraP4 = new short[1] ;
      P02PI4_A6845Lb_TraP5 = new short[1] ;
      P02PI4_A6847Lb_TraP6 = new short[1] ;
      P02PI4_A831TipColCod = new byte[1] ;
      P02PI4_n831TipColCod = new boolean[] {false} ;
      P02PI4_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P02PI4_A5532Lb_numero = new int[1] ;
      P02PI4_A396EmprCod = new String[] {""} ;
      P02PI4_A252CliCod = new int[1] ;
      A5540Lb_Cartaz = "" ;
      A5538Lb_ColNomC = "" ;
      A5536Lb_ColNom = "" ;
      A6653Lb_Tra1 = "" ;
      A6655Lb_Tra2 = "" ;
      A6657Lb_Tra3 = "" ;
      A6842Lb_Tra4 = "" ;
      A6844Lb_Tra5 = "" ;
      A6846Lb_Tra6 = "" ;
      A5541Lb_FechaE = GXutil.nullDate() ;
      W396EmprCod = "" ;
      AV14Lb_rcopenv = "" ;
      AV19Lb_rcopnap = "" ;
      P02PI5_A396EmprCod = new String[] {""} ;
      P02PI5_A5532Lb_numero = new int[1] ;
      P02PI5_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      P02PI5_A5563Lb_FechaR = new java.util.Date[] {GXutil.nullDate()} ;
      P02PI5_A6631Lb_ProvDef = new String[] {""} ;
      P02PI5_A6461Lb_FecNoa1 = new java.util.Date[] {GXutil.nullDate()} ;
      P02PI5_A5555Lb_opcion = new String[] {""} ;
      A5567Lb_FechaEn = GXutil.nullDate() ;
      A5563Lb_FechaR = GXutil.nullDate() ;
      A6631Lb_ProvDef = "" ;
      A6461Lb_FecNoa1 = GXutil.nullDate() ;
      A5555Lb_opcion = "" ;
      AV15LB_FECHAEN = GXutil.nullDate() ;
      AV16LB_FECHAR = GXutil.nullDate() ;
      AV17LB_RCOPAPR = "" ;
      AV20Lb_rcProDe = "" ;
      AV18LB_FECNOA1 = GXutil.nullDate() ;
      AV21Ceros6 = "" ;
      AV22Cartaz_6 = "" ;
      A6934Lb_rcncar = "" ;
      A6935Lb_rccorc = "" ;
      A6937Lb_rccor = "" ;
      A6940Lb_rcp1 = "" ;
      A6941Lb_rcp2 = "" ;
      A6942Lb_rcp3 = "" ;
      A6943Lb_rcp4 = "" ;
      A6944Lb_rcp5 = "" ;
      A6945Lb_rcp6 = "" ;
      A6931Lb_rcobs = "" ;
      A7009Lb_rcFecEt = GXutil.nullDate() ;
      A7015Lb_rcFeNap = GXutil.nullDate() ;
      A7014Lb_rcOpNap = "" ;
      A7013Lb_rcOpApr = "" ;
      A7012Lb_rcOpEnv = "" ;
      A7010Lb_rcFecEn = GXutil.nullDate() ;
      A7011Lb_rcFecRe = GXutil.nullDate() ;
      A8022Lb_rcProDe = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apregcor3__default(),
         new Object[] {
             new Object[] {
            P02PI2_A252CliCod, P02PI2_A396EmprCod, P02PI2_A6932Lb_Linurc, P02PI2_n6932Lb_Linurc
            }
            , new Object[] {
            }
            , new Object[] {
            P02PI4_A5540Lb_Cartaz, P02PI4_A5538Lb_ColNomC, P02PI4_A5539Lb_ColNumC, P02PI4_A5536Lb_ColNom, P02PI4_A5537Lb_ColNum, P02PI4_A6653Lb_Tra1, P02PI4_A6655Lb_Tra2, P02PI4_A6657Lb_Tra3, P02PI4_A6842Lb_Tra4, P02PI4_A6844Lb_Tra5,
            P02PI4_A6846Lb_Tra6, P02PI4_A6654Lb_TraP1, P02PI4_A6656Lb_TraP2, P02PI4_A6658Lb_TraP3, P02PI4_A6843Lb_TraP4, P02PI4_A6845Lb_TraP5, P02PI4_A6847Lb_TraP6, P02PI4_A831TipColCod, P02PI4_n831TipColCod, P02PI4_A5541Lb_FechaE,
            P02PI4_A5532Lb_numero, P02PI4_A396EmprCod, P02PI4_A252CliCod
            }
            , new Object[] {
            P02PI5_A396EmprCod, P02PI5_A5532Lb_numero, P02PI5_A5567Lb_FechaEn, P02PI5_A5563Lb_FechaR, P02PI5_A6631Lb_ProvDef, P02PI5_A6461Lb_FecNoa1, P02PI5_A5555Lb_opcion
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A831TipColCod ;
   private byte AV23Len_Cartaz ;
   private byte A6939Lb_rctc ;
   private short A6654Lb_TraP1 ;
   private short A6656Lb_TraP2 ;
   private short A6658Lb_TraP3 ;
   private short A6843Lb_TraP4 ;
   private short A6845Lb_TraP5 ;
   private short A6847Lb_TraP6 ;
   private short A6946Lb_rcpo1 ;
   private short A6947Lb_rcpo2 ;
   private short A6948Lb_rcpo3 ;
   private short A6949Lb_rcpo4 ;
   private short A6950Lb_rcpo5 ;
   private short A6951Lb_rcpo6 ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A6932Lb_Linurc ;
   private int AV11LB_LINURC ;
   private int AV12Clicod ;
   private int A5539Lb_ColNumC ;
   private int A5537Lb_ColNum ;
   private int A5532Lb_numero ;
   private int W252CliCod ;
   private int GX_INS983 ;
   private int A6930Lb_rclin ;
   private int A6933Lb_rcnens ;
   private int A6936Lb_rcncorc ;
   private int A6938Lb_rcncor ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String AV13Emprcod ;
   private String Gx_msg ;
   private String A5540Lb_Cartaz ;
   private String A5538Lb_ColNomC ;
   private String A5536Lb_ColNom ;
   private String A6653Lb_Tra1 ;
   private String A6655Lb_Tra2 ;
   private String A6657Lb_Tra3 ;
   private String A6842Lb_Tra4 ;
   private String A6844Lb_Tra5 ;
   private String A6846Lb_Tra6 ;
   private String W396EmprCod ;
   private String AV14Lb_rcopenv ;
   private String AV19Lb_rcopnap ;
   private String A6631Lb_ProvDef ;
   private String A5555Lb_opcion ;
   private String AV17LB_RCOPAPR ;
   private String AV20Lb_rcProDe ;
   private String AV21Ceros6 ;
   private String AV22Cartaz_6 ;
   private String A6934Lb_rcncar ;
   private String A6935Lb_rccorc ;
   private String A6937Lb_rccor ;
   private String A6940Lb_rcp1 ;
   private String A6941Lb_rcp2 ;
   private String A6942Lb_rcp3 ;
   private String A6943Lb_rcp4 ;
   private String A6944Lb_rcp5 ;
   private String A6945Lb_rcp6 ;
   private String A7014Lb_rcOpNap ;
   private String A7013Lb_rcOpApr ;
   private String A7012Lb_rcOpEnv ;
   private String A8022Lb_rcProDe ;
   private String Gx_emsg ;
   private java.util.Date A5541Lb_FechaE ;
   private java.util.Date A5567Lb_FechaEn ;
   private java.util.Date A5563Lb_FechaR ;
   private java.util.Date A6461Lb_FecNoa1 ;
   private java.util.Date AV15LB_FECHAEN ;
   private java.util.Date AV16LB_FECHAR ;
   private java.util.Date AV18LB_FECNOA1 ;
   private java.util.Date A7009Lb_rcFecEt ;
   private java.util.Date A7015Lb_rcFeNap ;
   private java.util.Date A7010Lb_rcFecEn ;
   private java.util.Date A7011Lb_rcFecRe ;
   private boolean n6932Lb_Linurc ;
   private boolean returnInSub ;
   private boolean n831TipColCod ;
   private boolean n6933Lb_rcnens ;
   private boolean n6934Lb_rcncar ;
   private boolean n6935Lb_rccorc ;
   private boolean n6936Lb_rcncorc ;
   private boolean n6937Lb_rccor ;
   private boolean n6938Lb_rcncor ;
   private boolean n6940Lb_rcp1 ;
   private boolean n6941Lb_rcp2 ;
   private boolean n6942Lb_rcp3 ;
   private boolean n6943Lb_rcp4 ;
   private boolean n6944Lb_rcp5 ;
   private boolean n6945Lb_rcp6 ;
   private boolean n6946Lb_rcpo1 ;
   private boolean n6947Lb_rcpo2 ;
   private boolean n6948Lb_rcpo3 ;
   private boolean n6949Lb_rcpo4 ;
   private boolean n6950Lb_rcpo5 ;
   private boolean n6951Lb_rcpo6 ;
   private boolean n6931Lb_rcobs ;
   private boolean n6939Lb_rctc ;
   private boolean n7009Lb_rcFecEt ;
   private boolean n7015Lb_rcFeNap ;
   private boolean n7014Lb_rcOpNap ;
   private boolean n7013Lb_rcOpApr ;
   private boolean n7012Lb_rcOpEnv ;
   private boolean n7010Lb_rcFecEn ;
   private boolean n7011Lb_rcFecRe ;
   private boolean n8022Lb_rcProDe ;
   private String A6931Lb_rcobs ;
   private IDataStoreProvider pr_default ;
   private int[] P02PI2_A252CliCod ;
   private String[] P02PI2_A396EmprCod ;
   private int[] P02PI2_A6932Lb_Linurc ;
   private boolean[] P02PI2_n6932Lb_Linurc ;
   private String[] P02PI4_A5540Lb_Cartaz ;
   private String[] P02PI4_A5538Lb_ColNomC ;
   private int[] P02PI4_A5539Lb_ColNumC ;
   private String[] P02PI4_A5536Lb_ColNom ;
   private int[] P02PI4_A5537Lb_ColNum ;
   private String[] P02PI4_A6653Lb_Tra1 ;
   private String[] P02PI4_A6655Lb_Tra2 ;
   private String[] P02PI4_A6657Lb_Tra3 ;
   private String[] P02PI4_A6842Lb_Tra4 ;
   private String[] P02PI4_A6844Lb_Tra5 ;
   private String[] P02PI4_A6846Lb_Tra6 ;
   private short[] P02PI4_A6654Lb_TraP1 ;
   private short[] P02PI4_A6656Lb_TraP2 ;
   private short[] P02PI4_A6658Lb_TraP3 ;
   private short[] P02PI4_A6843Lb_TraP4 ;
   private short[] P02PI4_A6845Lb_TraP5 ;
   private short[] P02PI4_A6847Lb_TraP6 ;
   private byte[] P02PI4_A831TipColCod ;
   private boolean[] P02PI4_n831TipColCod ;
   private java.util.Date[] P02PI4_A5541Lb_FechaE ;
   private int[] P02PI4_A5532Lb_numero ;
   private String[] P02PI4_A396EmprCod ;
   private int[] P02PI4_A252CliCod ;
   private String[] P02PI5_A396EmprCod ;
   private int[] P02PI5_A5532Lb_numero ;
   private java.util.Date[] P02PI5_A5567Lb_FechaEn ;
   private java.util.Date[] P02PI5_A5563Lb_FechaR ;
   private String[] P02PI5_A6631Lb_ProvDef ;
   private java.util.Date[] P02PI5_A6461Lb_FecNoa1 ;
   private String[] P02PI5_A5555Lb_opcion ;
}

final  class apregcor3__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02PI2", "SELECT CliCod, EmprCod, Lb_Linurc FROM TXPCLIENT WHERE EmprCod = '001' and CliCod > 0 ORDER BY EmprCod, CliCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02PI3", "UPDATE TXPCLIENT SET Lb_Linurc=?  WHERE EmprCod = ? AND CliCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCLIENT")
         ,new ForEachCursor("P02PI4", "SELECT Lb_Cartaz, Lb_ColNomC, Lb_ColNumC, Lb_ColNom, Lb_ColNum, Lb_Tra1, Lb_Tra2, Lb_Tra3, Lb_Tra4, Lb_Tra5, Lb_Tra6, Lb_TraP1, Lb_TraP2, Lb_TraP3, Lb_TraP4, Lb_TraP5, Lb_TraP6, TipColCod, Lb_FechaE, Lb_numero, EmprCod, CliCod FROM TXPENS001 WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02PI5", "SELECT EmprCod, Lb_numero, Lb_FechaEn, Lb_FechaR, Lb_ProvDef, Lb_FecNoa1, Lb_opcion FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero, Lb_opcion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02PI6", "INSERT INTO TXPREGCOR(EmprCod, CliCod, Lb_rclin, Lb_rcobs, Lb_rcnens, Lb_rcncar, Lb_rccorc, Lb_rcncorc, Lb_rccor, Lb_rcncor, Lb_rctc, Lb_rcp1, Lb_rcp2, Lb_rcp3, Lb_rcp4, Lb_rcp5, Lb_rcp6, Lb_rcpo1, Lb_rcpo2, Lb_rcpo3, Lb_rcpo4, Lb_rcpo5, Lb_rcpo6, Lb_rcFecEt, Lb_rcFecEn, Lb_rcFecRe, Lb_rcOpEnv, Lb_rcOpApr, Lb_rcOpNap, Lb_rcFeNap, Lb_rcProDe) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPREGCOR")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 4);
               ((String[]) buf[6])[0] = rslt.getString(7, 4);
               ((String[]) buf[7])[0] = rslt.getString(8, 4);
               ((String[]) buf[8])[0] = rslt.getString(9, 4);
               ((String[]) buf[9])[0] = rslt.getString(10, 4);
               ((String[]) buf[10])[0] = rslt.getString(11, 4);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               ((short[]) buf[15])[0] = rslt.getShort(16);
               ((short[]) buf[16])[0] = rslt.getShort(17);
               ((byte[]) buf[17])[0] = rslt.getByte(18);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(19);
               ((int[]) buf[20])[0] = rslt.getInt(20);
               ((String[]) buf[21])[0] = rslt.getString(21, 3);
               ((int[]) buf[22])[0] = rslt.getInt(22);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(4, (String)parms[4]);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[6]).intValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[8], 20);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[10], 13);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[12]).intValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[14], 13);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[16]).intValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(11, ((Number) parms[18]).byteValue());
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[20], 4);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[22], 4);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[24], 4);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[26], 4);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[28], 4);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[30], 4);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(18, ((Number) parms[32]).shortValue());
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(19, ((Number) parms[34]).shortValue());
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(20, ((Number) parms[36]).shortValue());
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(21, ((Number) parms[38]).shortValue());
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(22, ((Number) parms[40]).shortValue());
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(23, ((Number) parms[42]).shortValue());
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.DATE );
               }
               else
               {
                  stmt.setDate(24, (java.util.Date)parms[44]);
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.DATE );
               }
               else
               {
                  stmt.setDate(25, (java.util.Date)parms[46]);
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.DATE );
               }
               else
               {
                  stmt.setDate(26, (java.util.Date)parms[48]);
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(27, (String)parms[50], 100);
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(28, (String)parms[52], 1);
               }
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(29, (String)parms[54], 100);
               }
               if ( ((Boolean) parms[55]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.DATE );
               }
               else
               {
                  stmt.setDate(30, (java.util.Date)parms[56]);
               }
               if ( ((Boolean) parms[57]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(31, (String)parms[58], 1);
               }
               return;
      }
   }

}

