package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class partdatr extends GXProcedure
{
   public partdatr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( partdatr.class ), "" );
   }

   public partdatr( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      partdatr.this.aP2 = new String[] {""};
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
      partdatr.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      partdatr.this.AV8Clicod = aP1[0];
      this.aP1 = aP1;
      partdatr.this.AV9ArtCod = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GX_I = 1 ;
      while ( GX_I <= 1000 )
      {
         AV10Tab_clArt[GX_I-1] = 0 ;
         GX_I = (int)(GX_I+1) ;
      }
      AV11i = (short)(1) ;
      AV13Num_r = 0 ;
      /* Using cursor P037U2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV9ArtCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A65ArtCod = P037U2_A65ArtCod[0] ;
         A252CliCod = P037U2_A252CliCod[0] ;
         if ( A252CliCod != AV8Clicod )
         {
            if ( AV11i > 1000 )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "Maximo 1000 Clientes ¡¡¡", ""));
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            if ( A252CliCod > 0 )
            {
               AV10Tab_clArt[AV11i-1] = A252CliCod ;
               AV11i = (short)(AV11i+1) ;
               AV13Num_r = (int)(AV13Num_r+1) ;
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      Gx_msg = httpContext.getMessage( "Registros a procesar.. ", "") + GXutil.str( AV13Num_r, 6, 0) ;
      System.out.println( Gx_msg );
      AV11i = (short)(1) ;
      while ( AV11i <= 1000 )
      {
         if ( AV10Tab_clArt[AV11i-1] == 0 )
         {
            if (true) break;
         }
         AV12Clicodd = AV10Tab_clArt[AV11i-1] ;
         /* Optimized DELETE. */
         /* Using cursor P037U3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV12Clicodd), AV9ArtCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTLIN");
         /* End optimized DELETE. */
         AV11i = (short)(AV11i+1) ;
      }
      AV11i = (short)(1) ;
      while ( AV11i <= 1000 )
      {
         if ( AV10Tab_clArt[AV11i-1] == 0 )
         {
            if (true) break;
         }
         AV12Clicodd = AV10Tab_clArt[AV11i-1] ;
         /* Using cursor P037U4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV8Clicod), AV9ArtCod});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A65ArtCod = P037U4_A65ArtCod[0] ;
            A252CliCod = P037U4_A252CliCod[0] ;
            A12752Art_Tipo = P037U4_A12752Art_Tipo[0] ;
            n12752Art_Tipo = P037U4_n12752Art_Tipo[0] ;
            A12142ProStFec = P037U4_A12142ProStFec[0] ;
            A12141ProSta = P037U4_A12141ProSta[0] ;
            A11272ProFabs = P037U4_A11272ProFabs[0] ;
            A10556ProFecM = P037U4_A10556ProFecM[0] ;
            A10555ProUserM = P037U4_A10555ProUserM[0] ;
            A10554ProFecA = P037U4_A10554ProFecA[0] ;
            A10553ProUserA = P037U4_A10553ProUserA[0] ;
            A10412ProAct = P037U4_A10412ProAct[0] ;
            A10026DscCFa = P037U4_A10026DscCFa[0] ;
            A9629Art_els = P037U4_A9629Art_els[0] ;
            n9629Art_els = P037U4_n9629Art_els[0] ;
            A9628Art_ets = P037U4_A9628Art_ets[0] ;
            n9628Art_ets = P037U4_n9628Art_ets[0] ;
            A8955Art_Obs = P037U4_A8955Art_Obs[0] ;
            n8955Art_Obs = P037U4_n8955Art_Obs[0] ;
            A8166Art_Und = P037U4_A8166Art_Und[0] ;
            n8166Art_Und = P037U4_n8166Art_Und[0] ;
            A8165Art_Dsc = P037U4_A8165Art_Dsc[0] ;
            n8165Art_Dsc = P037U4_n8165Art_Dsc[0] ;
            A8084Art_RdoP = P037U4_A8084Art_RdoP[0] ;
            n8084Art_RdoP = P037U4_n8084Art_RdoP[0] ;
            A8083Art_AncP = P037U4_A8083Art_AncP[0] ;
            n8083Art_AncP = P037U4_n8083Art_AncP[0] ;
            A8082Art_PmlP = P037U4_A8082Art_PmlP[0] ;
            n8082Art_PmlP = P037U4_n8082Art_PmlP[0] ;
            A8081Art_GrmP = P037U4_A8081Art_GrmP[0] ;
            n8081Art_GrmP = P037U4_n8081Art_GrmP[0] ;
            A8080Art_PmlC = P037U4_A8080Art_PmlC[0] ;
            n8080Art_PmlC = P037U4_n8080Art_PmlC[0] ;
            A8079Art_AncC = P037U4_A8079Art_AncC[0] ;
            n8079Art_AncC = P037U4_n8079Art_AncC[0] ;
            A8078Art_GrmC = P037U4_A8078Art_GrmC[0] ;
            n8078Art_GrmC = P037U4_n8078Art_GrmC[0] ;
            A8077Art_GrmB = P037U4_A8077Art_GrmB[0] ;
            n8077Art_GrmB = P037U4_n8077Art_GrmB[0] ;
            A8076Art_AncB = P037U4_A8076Art_AncB[0] ;
            n8076Art_AncB = P037U4_n8076Art_AncB[0] ;
            A8075Art_Fabs = P037U4_A8075Art_Fabs[0] ;
            n8075Art_Fabs = P037U4_n8075Art_Fabs[0] ;
            A8074Art_Rdpc = P037U4_A8074Art_Rdpc[0] ;
            n8074Art_Rdpc = P037U4_n8074Art_Rdpc[0] ;
            A8073Art_Rdo = P037U4_A8073Art_Rdo[0] ;
            n8073Art_Rdo = P037U4_n8073Art_Rdo[0] ;
            A8072Art_Cor = P037U4_A8072Art_Cor[0] ;
            n8072Art_Cor = P037U4_n8072Art_Cor[0] ;
            A8071Art_Enc = P037U4_A8071Art_Enc[0] ;
            n8071Art_Enc = P037U4_n8071Art_Enc[0] ;
            A8070Art_Elar = P037U4_A8070Art_Elar[0] ;
            n8070Art_Elar = P037U4_n8070Art_Elar[0] ;
            A8069Art_Eanc = P037U4_A8069Art_Eanc[0] ;
            n8069Art_Eanc = P037U4_n8069Art_Eanc[0] ;
            A8068Art_PmlA = P037U4_A8068Art_PmlA[0] ;
            n8068Art_PmlA = P037U4_n8068Art_PmlA[0] ;
            A8067Art_Merma = P037U4_A8067Art_Merma[0] ;
            n8067Art_Merma = P037U4_n8067Art_Merma[0] ;
            A8066Art_AncA = P037U4_A8066Art_AncA[0] ;
            n8066Art_AncA = P037U4_n8066Art_AncA[0] ;
            A8065Art_GrmA = P037U4_A8065Art_GrmA[0] ;
            n8065Art_GrmA = P037U4_n8065Art_GrmA[0] ;
            A758ProCod = P037U4_A758ProCod[0] ;
            W396EmprCod = A396EmprCod ;
            W252CliCod = A252CliCod ;
            W65ArtCod = A65ArtCod ;
            /*
               INSERT RECORD ON TABLE TXPARTLIN

            */
            W396EmprCod = A396EmprCod ;
            W252CliCod = A252CliCod ;
            W65ArtCod = A65ArtCod ;
            W758ProCod = A758ProCod ;
            A252CliCod = AV12Clicodd ;
            A65ArtCod = AV9ArtCod ;
            /* Using cursor P037U5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, Boolean.valueOf(n8065Art_GrmA), Short.valueOf(A8065Art_GrmA), Boolean.valueOf(n8066Art_AncA), Short.valueOf(A8066Art_AncA), Boolean.valueOf(n8067Art_Merma), A8067Art_Merma, Boolean.valueOf(n8068Art_PmlA), Short.valueOf(A8068Art_PmlA), Boolean.valueOf(n8069Art_Eanc), Short.valueOf(A8069Art_Eanc), Boolean.valueOf(n8070Art_Elar), Short.valueOf(A8070Art_Elar), Boolean.valueOf(n8071Art_Enc), A8071Art_Enc, Boolean.valueOf(n8072Art_Cor), A8072Art_Cor, Boolean.valueOf(n8073Art_Rdo), A8073Art_Rdo, Boolean.valueOf(n8074Art_Rdpc), A8074Art_Rdpc, Boolean.valueOf(n8075Art_Fabs), A8075Art_Fabs, Boolean.valueOf(n8076Art_AncB), Short.valueOf(A8076Art_AncB), Boolean.valueOf(n8077Art_GrmB), Short.valueOf(A8077Art_GrmB), Boolean.valueOf(n8078Art_GrmC), Short.valueOf(A8078Art_GrmC), Boolean.valueOf(n8079Art_AncC), Short.valueOf(A8079Art_AncC), Boolean.valueOf(n8080Art_PmlC), Short.valueOf(A8080Art_PmlC), Boolean.valueOf(n8081Art_GrmP), Short.valueOf(A8081Art_GrmP), Boolean.valueOf(n8082Art_PmlP), Short.valueOf(A8082Art_PmlP), Boolean.valueOf(n8083Art_AncP), Short.valueOf(A8083Art_AncP), Boolean.valueOf(n8084Art_RdoP), A8084Art_RdoP, Boolean.valueOf(n8165Art_Dsc), A8165Art_Dsc, Boolean.valueOf(n8166Art_Und), A8166Art_Und, Boolean.valueOf(n8955Art_Obs), A8955Art_Obs, Boolean.valueOf(n9628Art_ets), A9628Art_ets, Boolean.valueOf(n9629Art_els), A9629Art_els, A10026DscCFa, A10412ProAct, A10553ProUserA, A10554ProFecA, A10555ProUserM, A10556ProFecM, A11272ProFabs, Byte.valueOf(A12141ProSta), A12142ProStFec, Boolean.valueOf(n12752Art_Tipo), A12752Art_Tipo});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTLIN");
            if ( (pr_default.getStatus(3) == 1) )
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
            A65ArtCod = W65ArtCod ;
            A758ProCod = W758ProCod ;
            /* End Insert */
            A396EmprCod = W396EmprCod ;
            A252CliCod = W252CliCod ;
            A65ArtCod = W65ArtCod ;
            pr_default.readNext(2);
         }
         pr_default.close(2);
         AV11i = (short)(AV11i+1) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = partdatr.this.A396EmprCod;
      this.aP1[0] = partdatr.this.AV8Clicod;
      this.aP2[0] = partdatr.this.AV9ArtCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "partdatr");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10Tab_clArt = new int[1000] ;
      scmdbuf = "" ;
      P037U2_A396EmprCod = new String[] {""} ;
      P037U2_A65ArtCod = new String[] {""} ;
      P037U2_A252CliCod = new int[1] ;
      A65ArtCod = "" ;
      Gx_msg = "" ;
      P037U4_A396EmprCod = new String[] {""} ;
      P037U4_A65ArtCod = new String[] {""} ;
      P037U4_A252CliCod = new int[1] ;
      P037U4_A12752Art_Tipo = new String[] {""} ;
      P037U4_n12752Art_Tipo = new boolean[] {false} ;
      P037U4_A12142ProStFec = new java.util.Date[] {GXutil.nullDate()} ;
      P037U4_A12141ProSta = new byte[1] ;
      P037U4_A11272ProFabs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P037U4_A10556ProFecM = new java.util.Date[] {GXutil.nullDate()} ;
      P037U4_A10555ProUserM = new String[] {""} ;
      P037U4_A10554ProFecA = new java.util.Date[] {GXutil.nullDate()} ;
      P037U4_A10553ProUserA = new String[] {""} ;
      P037U4_A10412ProAct = new String[] {""} ;
      P037U4_A10026DscCFa = new String[] {""} ;
      P037U4_A9629Art_els = new String[] {""} ;
      P037U4_n9629Art_els = new boolean[] {false} ;
      P037U4_A9628Art_ets = new String[] {""} ;
      P037U4_n9628Art_ets = new boolean[] {false} ;
      P037U4_A8955Art_Obs = new String[] {""} ;
      P037U4_n8955Art_Obs = new boolean[] {false} ;
      P037U4_A8166Art_Und = new String[] {""} ;
      P037U4_n8166Art_Und = new boolean[] {false} ;
      P037U4_A8165Art_Dsc = new String[] {""} ;
      P037U4_n8165Art_Dsc = new boolean[] {false} ;
      P037U4_A8084Art_RdoP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P037U4_n8084Art_RdoP = new boolean[] {false} ;
      P037U4_A8083Art_AncP = new short[1] ;
      P037U4_n8083Art_AncP = new boolean[] {false} ;
      P037U4_A8082Art_PmlP = new short[1] ;
      P037U4_n8082Art_PmlP = new boolean[] {false} ;
      P037U4_A8081Art_GrmP = new short[1] ;
      P037U4_n8081Art_GrmP = new boolean[] {false} ;
      P037U4_A8080Art_PmlC = new short[1] ;
      P037U4_n8080Art_PmlC = new boolean[] {false} ;
      P037U4_A8079Art_AncC = new short[1] ;
      P037U4_n8079Art_AncC = new boolean[] {false} ;
      P037U4_A8078Art_GrmC = new short[1] ;
      P037U4_n8078Art_GrmC = new boolean[] {false} ;
      P037U4_A8077Art_GrmB = new short[1] ;
      P037U4_n8077Art_GrmB = new boolean[] {false} ;
      P037U4_A8076Art_AncB = new short[1] ;
      P037U4_n8076Art_AncB = new boolean[] {false} ;
      P037U4_A8075Art_Fabs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P037U4_n8075Art_Fabs = new boolean[] {false} ;
      P037U4_A8074Art_Rdpc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P037U4_n8074Art_Rdpc = new boolean[] {false} ;
      P037U4_A8073Art_Rdo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P037U4_n8073Art_Rdo = new boolean[] {false} ;
      P037U4_A8072Art_Cor = new String[] {""} ;
      P037U4_n8072Art_Cor = new boolean[] {false} ;
      P037U4_A8071Art_Enc = new String[] {""} ;
      P037U4_n8071Art_Enc = new boolean[] {false} ;
      P037U4_A8070Art_Elar = new short[1] ;
      P037U4_n8070Art_Elar = new boolean[] {false} ;
      P037U4_A8069Art_Eanc = new short[1] ;
      P037U4_n8069Art_Eanc = new boolean[] {false} ;
      P037U4_A8068Art_PmlA = new short[1] ;
      P037U4_n8068Art_PmlA = new boolean[] {false} ;
      P037U4_A8067Art_Merma = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P037U4_n8067Art_Merma = new boolean[] {false} ;
      P037U4_A8066Art_AncA = new short[1] ;
      P037U4_n8066Art_AncA = new boolean[] {false} ;
      P037U4_A8065Art_GrmA = new short[1] ;
      P037U4_n8065Art_GrmA = new boolean[] {false} ;
      P037U4_A758ProCod = new String[] {""} ;
      A12752Art_Tipo = "" ;
      A12142ProStFec = GXutil.resetTime( GXutil.nullDate() );
      A11272ProFabs = DecimalUtil.ZERO ;
      A10556ProFecM = GXutil.resetTime( GXutil.nullDate() );
      A10555ProUserM = "" ;
      A10554ProFecA = GXutil.resetTime( GXutil.nullDate() );
      A10553ProUserA = "" ;
      A10412ProAct = "" ;
      A10026DscCFa = "" ;
      A9629Art_els = "" ;
      A9628Art_ets = "" ;
      A8955Art_Obs = "" ;
      A8166Art_Und = "" ;
      A8165Art_Dsc = "" ;
      A8084Art_RdoP = DecimalUtil.ZERO ;
      A8075Art_Fabs = DecimalUtil.ZERO ;
      A8074Art_Rdpc = DecimalUtil.ZERO ;
      A8073Art_Rdo = DecimalUtil.ZERO ;
      A8072Art_Cor = "" ;
      A8071Art_Enc = "" ;
      A8067Art_Merma = DecimalUtil.ZERO ;
      A758ProCod = "" ;
      W396EmprCod = "" ;
      W65ArtCod = "" ;
      W758ProCod = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.partdatr__default(),
         new Object[] {
             new Object[] {
            P037U2_A396EmprCod, P037U2_A65ArtCod, P037U2_A252CliCod
            }
            , new Object[] {
            }
            , new Object[] {
            P037U4_A396EmprCod, P037U4_A65ArtCod, P037U4_A252CliCod, P037U4_A12752Art_Tipo, P037U4_n12752Art_Tipo, P037U4_A12142ProStFec, P037U4_A12141ProSta, P037U4_A11272ProFabs, P037U4_A10556ProFecM, P037U4_A10555ProUserM,
            P037U4_A10554ProFecA, P037U4_A10553ProUserA, P037U4_A10412ProAct, P037U4_A10026DscCFa, P037U4_A9629Art_els, P037U4_n9629Art_els, P037U4_A9628Art_ets, P037U4_n9628Art_ets, P037U4_A8955Art_Obs, P037U4_n8955Art_Obs,
            P037U4_A8166Art_Und, P037U4_n8166Art_Und, P037U4_A8165Art_Dsc, P037U4_n8165Art_Dsc, P037U4_A8084Art_RdoP, P037U4_n8084Art_RdoP, P037U4_A8083Art_AncP, P037U4_n8083Art_AncP, P037U4_A8082Art_PmlP, P037U4_n8082Art_PmlP,
            P037U4_A8081Art_GrmP, P037U4_n8081Art_GrmP, P037U4_A8080Art_PmlC, P037U4_n8080Art_PmlC, P037U4_A8079Art_AncC, P037U4_n8079Art_AncC, P037U4_A8078Art_GrmC, P037U4_n8078Art_GrmC, P037U4_A8077Art_GrmB, P037U4_n8077Art_GrmB,
            P037U4_A8076Art_AncB, P037U4_n8076Art_AncB, P037U4_A8075Art_Fabs, P037U4_n8075Art_Fabs, P037U4_A8074Art_Rdpc, P037U4_n8074Art_Rdpc, P037U4_A8073Art_Rdo, P037U4_n8073Art_Rdo, P037U4_A8072Art_Cor, P037U4_n8072Art_Cor,
            P037U4_A8071Art_Enc, P037U4_n8071Art_Enc, P037U4_A8070Art_Elar, P037U4_n8070Art_Elar, P037U4_A8069Art_Eanc, P037U4_n8069Art_Eanc, P037U4_A8068Art_PmlA, P037U4_n8068Art_PmlA, P037U4_A8067Art_Merma, P037U4_n8067Art_Merma,
            P037U4_A8066Art_AncA, P037U4_n8066Art_AncA, P037U4_A8065Art_GrmA, P037U4_n8065Art_GrmA, P037U4_A758ProCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A12141ProSta ;
   private short AV11i ;
   private short A8083Art_AncP ;
   private short A8082Art_PmlP ;
   private short A8081Art_GrmP ;
   private short A8080Art_PmlC ;
   private short A8079Art_AncC ;
   private short A8078Art_GrmC ;
   private short A8077Art_GrmB ;
   private short A8076Art_AncB ;
   private short A8070Art_Elar ;
   private short A8069Art_Eanc ;
   private short A8068Art_PmlA ;
   private short A8066Art_AncA ;
   private short A8065Art_GrmA ;
   private short Gx_err ;
   private int AV8Clicod ;
   private int GX_I ;
   private int AV10Tab_clArt[] ;
   private int AV13Num_r ;
   private int A252CliCod ;
   private int AV12Clicodd ;
   private int W252CliCod ;
   private int GX_INS11 ;
   private java.math.BigDecimal A11272ProFabs ;
   private java.math.BigDecimal A8084Art_RdoP ;
   private java.math.BigDecimal A8075Art_Fabs ;
   private java.math.BigDecimal A8074Art_Rdpc ;
   private java.math.BigDecimal A8073Art_Rdo ;
   private java.math.BigDecimal A8067Art_Merma ;
   private String A396EmprCod ;
   private String AV9ArtCod ;
   private String scmdbuf ;
   private String A65ArtCod ;
   private String Gx_msg ;
   private String A12752Art_Tipo ;
   private String A10555ProUserM ;
   private String A10553ProUserA ;
   private String A10412ProAct ;
   private String A10026DscCFa ;
   private String A9629Art_els ;
   private String A9628Art_ets ;
   private String A8166Art_Und ;
   private String A8165Art_Dsc ;
   private String A8072Art_Cor ;
   private String A8071Art_Enc ;
   private String A758ProCod ;
   private String W396EmprCod ;
   private String W65ArtCod ;
   private String W758ProCod ;
   private String Gx_emsg ;
   private java.util.Date A12142ProStFec ;
   private java.util.Date A10556ProFecM ;
   private java.util.Date A10554ProFecA ;
   private boolean n12752Art_Tipo ;
   private boolean n9629Art_els ;
   private boolean n9628Art_ets ;
   private boolean n8955Art_Obs ;
   private boolean n8166Art_Und ;
   private boolean n8165Art_Dsc ;
   private boolean n8084Art_RdoP ;
   private boolean n8083Art_AncP ;
   private boolean n8082Art_PmlP ;
   private boolean n8081Art_GrmP ;
   private boolean n8080Art_PmlC ;
   private boolean n8079Art_AncC ;
   private boolean n8078Art_GrmC ;
   private boolean n8077Art_GrmB ;
   private boolean n8076Art_AncB ;
   private boolean n8075Art_Fabs ;
   private boolean n8074Art_Rdpc ;
   private boolean n8073Art_Rdo ;
   private boolean n8072Art_Cor ;
   private boolean n8071Art_Enc ;
   private boolean n8070Art_Elar ;
   private boolean n8069Art_Eanc ;
   private boolean n8068Art_PmlA ;
   private boolean n8067Art_Merma ;
   private boolean n8066Art_AncA ;
   private boolean n8065Art_GrmA ;
   private String A8955Art_Obs ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P037U2_A396EmprCod ;
   private String[] P037U2_A65ArtCod ;
   private int[] P037U2_A252CliCod ;
   private String[] P037U4_A396EmprCod ;
   private String[] P037U4_A65ArtCod ;
   private int[] P037U4_A252CliCod ;
   private String[] P037U4_A12752Art_Tipo ;
   private boolean[] P037U4_n12752Art_Tipo ;
   private java.util.Date[] P037U4_A12142ProStFec ;
   private byte[] P037U4_A12141ProSta ;
   private java.math.BigDecimal[] P037U4_A11272ProFabs ;
   private java.util.Date[] P037U4_A10556ProFecM ;
   private String[] P037U4_A10555ProUserM ;
   private java.util.Date[] P037U4_A10554ProFecA ;
   private String[] P037U4_A10553ProUserA ;
   private String[] P037U4_A10412ProAct ;
   private String[] P037U4_A10026DscCFa ;
   private String[] P037U4_A9629Art_els ;
   private boolean[] P037U4_n9629Art_els ;
   private String[] P037U4_A9628Art_ets ;
   private boolean[] P037U4_n9628Art_ets ;
   private String[] P037U4_A8955Art_Obs ;
   private boolean[] P037U4_n8955Art_Obs ;
   private String[] P037U4_A8166Art_Und ;
   private boolean[] P037U4_n8166Art_Und ;
   private String[] P037U4_A8165Art_Dsc ;
   private boolean[] P037U4_n8165Art_Dsc ;
   private java.math.BigDecimal[] P037U4_A8084Art_RdoP ;
   private boolean[] P037U4_n8084Art_RdoP ;
   private short[] P037U4_A8083Art_AncP ;
   private boolean[] P037U4_n8083Art_AncP ;
   private short[] P037U4_A8082Art_PmlP ;
   private boolean[] P037U4_n8082Art_PmlP ;
   private short[] P037U4_A8081Art_GrmP ;
   private boolean[] P037U4_n8081Art_GrmP ;
   private short[] P037U4_A8080Art_PmlC ;
   private boolean[] P037U4_n8080Art_PmlC ;
   private short[] P037U4_A8079Art_AncC ;
   private boolean[] P037U4_n8079Art_AncC ;
   private short[] P037U4_A8078Art_GrmC ;
   private boolean[] P037U4_n8078Art_GrmC ;
   private short[] P037U4_A8077Art_GrmB ;
   private boolean[] P037U4_n8077Art_GrmB ;
   private short[] P037U4_A8076Art_AncB ;
   private boolean[] P037U4_n8076Art_AncB ;
   private java.math.BigDecimal[] P037U4_A8075Art_Fabs ;
   private boolean[] P037U4_n8075Art_Fabs ;
   private java.math.BigDecimal[] P037U4_A8074Art_Rdpc ;
   private boolean[] P037U4_n8074Art_Rdpc ;
   private java.math.BigDecimal[] P037U4_A8073Art_Rdo ;
   private boolean[] P037U4_n8073Art_Rdo ;
   private String[] P037U4_A8072Art_Cor ;
   private boolean[] P037U4_n8072Art_Cor ;
   private String[] P037U4_A8071Art_Enc ;
   private boolean[] P037U4_n8071Art_Enc ;
   private short[] P037U4_A8070Art_Elar ;
   private boolean[] P037U4_n8070Art_Elar ;
   private short[] P037U4_A8069Art_Eanc ;
   private boolean[] P037U4_n8069Art_Eanc ;
   private short[] P037U4_A8068Art_PmlA ;
   private boolean[] P037U4_n8068Art_PmlA ;
   private java.math.BigDecimal[] P037U4_A8067Art_Merma ;
   private boolean[] P037U4_n8067Art_Merma ;
   private short[] P037U4_A8066Art_AncA ;
   private boolean[] P037U4_n8066Art_AncA ;
   private short[] P037U4_A8065Art_GrmA ;
   private boolean[] P037U4_n8065Art_GrmA ;
   private String[] P037U4_A758ProCod ;
}

final  class partdatr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P037U2", "SELECT EmprCod, ArtCod, CliCod FROM TXPARTICU WHERE EmprCod = ? and ArtCod = ? ORDER BY EmprCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P037U3", "DELETE FROM TXPARTLIN  WHERE EmprCod = ? and CliCod = ? and ArtCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPARTLIN")
         ,new ForEachCursor("P037U4", "SELECT EmprCod, ArtCod, CliCod, Art_Tipo, ProStFec, ProSta, ProFabs, ProFecM, ProUserM, ProFecA, ProUserA, ProAct, DscCFa, Art_els, Art_ets, Art_Obs, Art_Und, Art_Dsc, Art_RdoP, Art_AncP, Art_PmlP, Art_GrmP, Art_PmlC, Art_AncC, Art_GrmC, Art_GrmB, Art_AncB, Art_Fabs, Art_Rdpc, Art_Rdo, Art_Cor, Art_Enc, Art_Elar, Art_Eanc, Art_PmlA, Art_Merma, Art_AncA, Art_GrmA, ProCod FROM TXPARTLIN WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P037U5", "INSERT INTO TXPARTLIN(EmprCod, CliCod, ArtCod, ProCod, Art_GrmA, Art_AncA, Art_Merma, Art_PmlA, Art_Eanc, Art_Elar, Art_Enc, Art_Cor, Art_Rdo, Art_Rdpc, Art_Fabs, Art_AncB, Art_GrmB, Art_GrmC, Art_AncC, Art_PmlC, Art_GrmP, Art_PmlP, Art_AncP, Art_RdoP, Art_Dsc, Art_Und, Art_Obs, Art_ets, Art_els, DscCFa, ProAct, ProUserA, ProFecA, ProUserM, ProFecM, ProFabs, ProSta, ProStFec, Art_Tipo) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPARTLIN")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(5);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 10);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 10);
               ((String[]) buf[12])[0] = rslt.getString(12, 1);
               ((String[]) buf[13])[0] = rslt.getString(13, 30);
               ((String[]) buf[14])[0] = rslt.getString(14, 10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(15, 10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(16);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(17, 1);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(18, 26);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((short[]) buf[26])[0] = rslt.getShort(20);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((short[]) buf[28])[0] = rslt.getShort(21);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((short[]) buf[30])[0] = rslt.getShort(22);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((short[]) buf[32])[0] = rslt.getShort(23);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((short[]) buf[34])[0] = rslt.getShort(24);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((short[]) buf[36])[0] = rslt.getShort(25);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((short[]) buf[38])[0] = rslt.getShort(26);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((short[]) buf[40])[0] = rslt.getShort(27);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[42])[0] = rslt.getBigDecimal(28,2);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[44])[0] = rslt.getBigDecimal(29,2);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[46])[0] = rslt.getBigDecimal(30,2);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getString(31, 1);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((String[]) buf[50])[0] = rslt.getString(32, 1);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((short[]) buf[52])[0] = rslt.getShort(33);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((short[]) buf[54])[0] = rslt.getShort(34);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((short[]) buf[56])[0] = rslt.getShort(35);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[58])[0] = rslt.getBigDecimal(36,2);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((short[]) buf[60])[0] = rslt.getShort(37);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((short[]) buf[62])[0] = rslt.getShort(38);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((String[]) buf[64])[0] = rslt.getString(39, 8);
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
               stmt.setString(2, (String)parms[1], 16);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[7]).shortValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[11]).shortValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[13]).shortValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[15]).shortValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[17], 1);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[19], 1);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[21], 2);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[23], 2);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(15, (java.math.BigDecimal)parms[25], 2);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[27]).shortValue());
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(17, ((Number) parms[29]).shortValue());
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(18, ((Number) parms[31]).shortValue());
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(19, ((Number) parms[33]).shortValue());
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(20, ((Number) parms[35]).shortValue());
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(21, ((Number) parms[37]).shortValue());
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(22, ((Number) parms[39]).shortValue());
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(23, ((Number) parms[41]).shortValue());
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(24, (java.math.BigDecimal)parms[43], 2);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[45], 26);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(26, (String)parms[47], 1);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(27, (String)parms[49], 800);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(28, (String)parms[51], 10);
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(29, (String)parms[53], 10);
               }
               stmt.setString(30, (String)parms[54], 30);
               stmt.setString(31, (String)parms[55], 1);
               stmt.setString(32, (String)parms[56], 10);
               stmt.setDateTime(33, (java.util.Date)parms[57], false);
               stmt.setString(34, (String)parms[58], 10);
               stmt.setDateTime(35, (java.util.Date)parms[59], false);
               stmt.setBigDecimal(36, (java.math.BigDecimal)parms[60], 2);
               stmt.setByte(37, ((Number) parms[61]).byteValue());
               stmt.setDateTime(38, (java.util.Date)parms[62], false);
               if ( ((Boolean) parms[63]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(39, (String)parms[64], 1);
               }
               return;
      }
   }

}

