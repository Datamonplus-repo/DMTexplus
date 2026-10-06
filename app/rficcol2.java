package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rficcol2 extends GXReport
{
   public rficcol2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rficcol2.class ), "" );
   }

   public rficcol2( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           String[] aP1 ,
                                           int[] aP2 ,
                                           String[] aP3 ,
                                           String[] aP4 ,
                                           int[] aP5 ,
                                           byte[] aP6 ,
                                           java.math.BigDecimal[] aP7 ,
                                           int[] aP8 ,
                                           String[] aP9 ,
                                           java.math.BigDecimal[] aP10 )
   {
      rficcol2.this.aP11 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
      return aP11[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        int[] aP5 ,
                        byte[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        int[] aP8 ,
                        String[] aP9 ,
                        java.math.BigDecimal[] aP10 ,
                        java.math.BigDecimal[] aP11 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             int[] aP5 ,
                             byte[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             int[] aP8 ,
                             String[] aP9 ,
                             java.math.BigDecimal[] aP10 ,
                             java.math.BigDecimal[] aP11 )
   {
      rficcol2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rficcol2.this.A910Workstat = aP1[0];
      this.aP1 = aP1;
      rficcol2.this.AV9CliCod = aP2[0];
      this.aP2 = aP2;
      rficcol2.this.AV10ForSer = aP3[0];
      this.aP3 = aP3;
      rficcol2.this.AV11ForColNom = aP4[0];
      this.aP4 = aP4;
      rficcol2.this.AV12ForColNum = aP5[0];
      this.aP5 = aP5;
      rficcol2.this.AV13TipColCod = aP6[0];
      this.aP6 = aP6;
      rficcol2.this.AV14TotKilos = aP7[0];
      this.aP7 = aP7;
      rficcol2.this.AV15Volumen = aP8[0];
      this.aP8 = aP8;
      rficcol2.this.AV16MaqCod = aP9[0];
      this.aP9 = aP9;
      rficcol2.this.AV53Incre = aP10[0];
      this.aP10 = aP10;
      rficcol2.this.AV21TotKilo = aP11[0];
      this.aP11 = aP11;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      M_top = 0 ;
      M_bot = 1 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      try
      {
         Gx_out = "SCR" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REPGRAF", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("FICHA COLOR II") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*1)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXv_char1[0] = AV66ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SIMULAZ", ""), GXv_char1) ;
         rficcol2.this.AV66ContDsc = GXv_char1[0] ;
         GXv_int2[0] = AV71FlagUni ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, "100000", GXv_int2) ;
         rficcol2.this.AV71FlagUni = GXv_int2[0] ;
         GXt_char3 = AV31Lit0 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char1) ;
         rficcol2.this.GXt_char3 = GXv_char1[0] ;
         AV31Lit0 = GXt_char3 ;
         GXt_char3 = AV32Lit1 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char1) ;
         rficcol2.this.GXt_char3 = GXv_char1[0] ;
         AV32Lit1 = GXt_char3 ;
         GXt_char3 = AV24Lit2 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1547_", ""), (byte)(99), GXv_char1) ;
         rficcol2.this.GXt_char3 = GXv_char1[0] ;
         AV24Lit2 = GXt_char3 ;
         GXt_char3 = AV33Lit3 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char1) ;
         rficcol2.this.GXt_char3 = GXv_char1[0] ;
         AV33Lit3 = GXt_char3 ;
         GXt_char3 = AV26Lit4 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN389_", ""), (byte)(99), GXv_char1) ;
         rficcol2.this.GXt_char3 = GXv_char1[0] ;
         AV26Lit4 = GXt_char3 ;
         GXt_char3 = AV27Lit5 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN388_", ""), (byte)(99), GXv_char1) ;
         rficcol2.this.GXt_char3 = GXv_char1[0] ;
         AV27Lit5 = GXt_char3 ;
         GXt_char3 = AV28Lit6 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN387_", ""), (byte)(99), GXv_char1) ;
         rficcol2.this.GXt_char3 = GXv_char1[0] ;
         AV28Lit6 = GXt_char3 ;
         GXt_char3 = AV29Lit7 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN386_", ""), (byte)(99), GXv_char1) ;
         rficcol2.this.GXt_char3 = GXv_char1[0] ;
         AV29Lit7 = GXt_char3 ;
         GXt_char3 = AV30Lit8 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2458_", ""), (byte)(99), GXv_char1) ;
         rficcol2.this.GXt_char3 = GXv_char1[0] ;
         AV30Lit8 = GXt_char3 ;
         GXt_char3 = AV34Lit9 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN145_", ""), (byte)(99), GXv_char1) ;
         rficcol2.this.GXt_char3 = GXv_char1[0] ;
         AV34Lit9 = GXt_char3 ;
         GXt_char3 = AV35Lit10 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1439_", ""), (byte)(99), GXv_char1) ;
         rficcol2.this.GXt_char3 = GXv_char1[0] ;
         AV35Lit10 = GXt_char3 ;
         GXt_char3 = AV36Lit11 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN116_", ""), (byte)(99), GXv_char1) ;
         rficcol2.this.GXt_char3 = GXv_char1[0] ;
         AV36Lit11 = GXt_char3 ;
         GXt_char3 = AV37Lit12 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN121_", ""), (byte)(99), GXv_char1) ;
         rficcol2.this.GXt_char3 = GXv_char1[0] ;
         AV37Lit12 = GXt_char3 ;
         GXt_char3 = AV38Lit13 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1421_", ""), (byte)(99), GXv_char1) ;
         rficcol2.this.GXt_char3 = GXv_char1[0] ;
         AV38Lit13 = GXt_char3 ;
         AV38Lit13 = GXutil.substring( AV38Lit13, 1, 6) ;
         GXt_char3 = AV39Lit14 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN378_", ""), (byte)(99), GXv_char1) ;
         rficcol2.this.GXt_char3 = GXv_char1[0] ;
         AV39Lit14 = GXt_char3 ;
         GXt_char3 = AV40Lit15 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT234_", ""), (byte)(99), GXv_char1) ;
         rficcol2.this.GXt_char3 = GXv_char1[0] ;
         AV40Lit15 = GXt_char3 ;
         AV40Lit15 = GXutil.substring( AV40Lit15, 1, 9) ;
         GXt_char3 = AV45Lit16 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1321_", ""), (byte)(99), GXv_char1) ;
         rficcol2.this.GXt_char3 = GXv_char1[0] ;
         AV45Lit16 = GXt_char3 ;
         GXt_char3 = AV42Lit17 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1545_", ""), (byte)(99), GXv_char1) ;
         rficcol2.this.GXt_char3 = GXv_char1[0] ;
         AV42Lit17 = GXt_char3 ;
         AV42Lit17 = GXutil.substring( AV42Lit17, 1, 6) ;
         GXt_char3 = AV43Lit18 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1546_", ""), (byte)(99), GXv_char1) ;
         rficcol2.this.GXt_char3 = GXv_char1[0] ;
         AV43Lit18 = GXt_char3 ;
         GXt_char3 = AV44Lit19 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1496_", ""), (byte)(99), GXv_char1) ;
         rficcol2.this.GXt_char3 = GXv_char1[0] ;
         AV44Lit19 = GXt_char3 ;
         GXt_char3 = AV51Lit20 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT3_", ""), (byte)(99), GXv_char1) ;
         rficcol2.this.GXt_char3 = GXv_char1[0] ;
         AV51Lit20 = GXt_char3 ;
         GXt_char3 = AV52Lit21 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1193_", ""), (byte)(99), GXv_char1) ;
         rficcol2.this.GXt_char3 = GXv_char1[0] ;
         AV52Lit21 = GXt_char3 ;
         GXt_char3 = AV54Lit22 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1541_", ""), (byte)(99), GXv_char1) ;
         rficcol2.this.GXt_char3 = GXv_char1[0] ;
         AV54Lit22 = GXt_char3 ;
         GXt_char3 = AV61Lit23 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN758_", ""), (byte)(99), GXv_char1) ;
         rficcol2.this.GXt_char3 = GXv_char1[0] ;
         AV61Lit23 = GXt_char3 ;
         GXt_char3 = AV62Lit24 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN759_", ""), (byte)(99), GXv_char1) ;
         rficcol2.this.GXt_char3 = GXv_char1[0] ;
         AV62Lit24 = GXt_char3 ;
         GXt_char3 = AV63Lit25 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN760_", ""), (byte)(99), GXv_char1) ;
         rficcol2.this.GXt_char3 = GXv_char1[0] ;
         AV63Lit25 = GXt_char3 ;
         GXt_char3 = AV69Lit26 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN134_", ""), (byte)(99), GXv_char1) ;
         rficcol2.this.GXt_char3 = GXv_char1[0] ;
         AV69Lit26 = GXt_char3 ;
         GXt_char3 = AV75Lit27 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT2014_", ""), (byte)(99), GXv_char1) ;
         rficcol2.this.GXt_char3 = GXv_char1[0] ;
         AV75Lit27 = GXt_char3 ;
         /* Using cursor P06Z22 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV9CliCod), AV10ForSer, AV11ForColNom, Integer.valueOf(AV12ForColNum), Byte.valueOf(AV13TipColCod)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A831TipColCod = P06Z22_A831TipColCod[0] ;
            A483ForColNum = P06Z22_A483ForColNum[0] ;
            A482ForColNom = P06Z22_A482ForColNom[0] ;
            A494ForSer = P06Z22_A494ForSer[0] ;
            A252CliCod = P06Z22_A252CliCod[0] ;
            A1191ForNomCli = P06Z22_A1191ForNomCli[0] ;
            n1191ForNomCli = P06Z22_n1191ForNomCli[0] ;
            A583IntCod = P06Z22_A583IntCod[0] ;
            A584IntDsc = P06Z22_A584IntDsc[0] ;
            n584IntDsc = P06Z22_n584IntDsc[0] ;
            A832TipColDsc = P06Z22_A832TipColDsc[0] ;
            n832TipColDsc = P06Z22_n832TipColDsc[0] ;
            A279CliNom = P06Z22_A279CliNom[0] ;
            A1192ForNumCli = P06Z22_A1192ForNumCli[0] ;
            n1192ForNumCli = P06Z22_n1192ForNumCli[0] ;
            A995ForTonal = P06Z22_A995ForTonal[0] ;
            n995ForTonal = P06Z22_n995ForTonal[0] ;
            A626MatCod = P06Z22_A626MatCod[0] ;
            A627MatDsc = P06Z22_A627MatDsc[0] ;
            n627MatDsc = P06Z22_n627MatDsc[0] ;
            A1515MacProDsc = P06Z22_A1515MacProDsc[0] ;
            A1514MacProCod = P06Z22_A1514MacProCod[0] ;
            n1514MacProCod = P06Z22_n1514MacProCod[0] ;
            A279CliNom = P06Z22_A279CliNom[0] ;
            A584IntDsc = P06Z22_A584IntDsc[0] ;
            n584IntDsc = P06Z22_n584IntDsc[0] ;
            A627MatDsc = P06Z22_A627MatDsc[0] ;
            n627MatDsc = P06Z22_n627MatDsc[0] ;
            A832TipColDsc = P06Z22_A832TipColDsc[0] ;
            n832TipColDsc = P06Z22_n832TipColDsc[0] ;
            A1515MacProDsc = P06Z22_A1515MacProDsc[0] ;
            AV46ForNomCli = A1191ForNomCli ;
            AV48IntCod = A583IntCod ;
            AV49IntDsc = A584IntDsc ;
            AV50TipColDsc = A832TipColDsc ;
            AV64CliNom = A279CliNom ;
            AV47ForNumCli = A1192ForNumCli ;
            AV76ForTonal = A995ForTonal ;
            AV67MatCod = A626MatCod ;
            AV68matDsc = A627MatDsc ;
            AV100MacProDsc = A1515MacProDsc ;
            AV101MacProCod = A1514MacProCod ;
            GX_I = 1 ;
            while ( GX_I <= 100 )
            {
               AV78Tab_pro[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            AV79j = (short)(1) ;
            /* Using cursor P06Z23 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A764ProForCod = P06Z23_A764ProForCod[0] ;
               A1160ProForL = P06Z23_A1160ProForL[0] ;
               AV78Tab_pro[AV79j-1] = A764ProForCod ;
               AV79j = (short)(AV79j+1) ;
               pr_default.readNext(1);
            }
            pr_default.close(1);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Using cursor P06Z24 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV9CliCod), AV10ForSer});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A829TipArtCod = P06Z24_A829TipArtCod[0] ;
            A65ArtCod = P06Z24_A65ArtCod[0] ;
            A252CliCod = P06Z24_A252CliCod[0] ;
            A69ArtDsc = P06Z24_A69ArtDsc[0] ;
            n69ArtDsc = P06Z24_n69ArtDsc[0] ;
            A830TipArtDsc = P06Z24_A830TipArtDsc[0] ;
            n830TipArtDsc = P06Z24_n830TipArtDsc[0] ;
            A830TipArtDsc = P06Z24_A830TipArtDsc[0] ;
            n830TipArtDsc = P06Z24_n830TipArtDsc[0] ;
            AV55ArtDsc = A69ArtDsc ;
            AV77TipArtDsc = A830TipArtDsc ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
         /* Using cursor P06Z25 */
         pr_default.execute(3, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A407EmprNom = P06Z25_A407EmprNom[0] ;
            n407EmprNom = P06Z25_n407EmprNom[0] ;
            AV25NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
         AV80Nlin = (short)(1) ;
         GX_I = 1 ;
         while ( GX_I <= 230 )
         {
            AV81RecPrdNum[GX_I-1] = "" ;
            GX_I = (int)(GX_I+1) ;
         }
         GX_I = 1 ;
         while ( GX_I <= 230 )
         {
            AV82FacCon[GX_I-1] = DecimalUtil.ZERO ;
            GX_I = (int)(GX_I+1) ;
         }
         GX_I = 1 ;
         while ( GX_I <= 230 )
         {
            AV83Unidadi[GX_I-1] = "" ;
            GX_I = (int)(GX_I+1) ;
         }
         GX_I = 1 ;
         while ( GX_I <= 230 )
         {
            AV84RecPrdDsc[GX_I-1] = "" ;
            GX_I = (int)(GX_I+1) ;
         }
         /* Using cursor P06Z26 */
         pr_default.execute(4, new Object[] {A396EmprCod, A910Workstat});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A719PrdNum = P06Z26_A719PrdNum[0] ;
            A490ForPrdUMe = P06Z26_A490ForPrdUMe[0] ;
            A897EscMDsc = P06Z26_A897EscMDsc[0] ;
            A718PrdNom = P06Z26_A718PrdNom[0] ;
            A887EscMLin = P06Z26_A887EscMLin[0] ;
            A718PrdNom = P06Z26_A718PrdNom[0] ;
            if ( ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), httpContext.getMessage( "C", "")) == 0 ) || (GXutil.strcmp("", A719PrdNum)==0) )
            {
            }
            else
            {
               AV85Var2 = "" ;
               if ( A490ForPrdUMe == 1 )
               {
                  AV85Var2 = httpContext.getMessage( "GL", "") ;
               }
               if ( A490ForPrdUMe == 2 )
               {
                  AV85Var2 = httpContext.getMessage( "CL", "") ;
               }
               if ( A490ForPrdUMe == 3 )
               {
                  AV85Var2 = "%" ;
               }
               AV81RecPrdNum[AV80Nlin-1] = A719PrdNum ;
               AV82FacCon[AV80Nlin-1] = CommonUtil.decimalVal( GXutil.substring( A897EscMDsc, 1, 10), ".") ;
               AV83Unidadi[AV80Nlin-1] = AV85Var2 ;
               AV84RecPrdDsc[AV80Nlin-1] = A718PrdNom ;
               AV80Nlin = (short)(AV80Nlin+1) ;
               if ( AV80Nlin > 230 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
            pr_default.readNext(4);
         }
         pr_default.close(4);
         AV86TLin = AV80Nlin ;
         AV80Nlin = (short)(1) ;
         AV87Lincol1 = (short)(1) ;
         AV88Lincol2 = (short)(21) ;
         AV89LinPag = (byte)(1) ;
         while ( AV80Nlin <= AV86TLin )
         {
            AV90UniLin1 = AV83Unidadi[AV87Lincol1-1] ;
            AV93RecPrdLin1 = AV81RecPrdNum[AV87Lincol1-1] ;
            AV92FacConLin1 = AV82FacCon[AV87Lincol1-1] ;
            AV91RecDscLin1 = AV84RecPrdDsc[AV87Lincol1-1] ;
            AV94UniLin2 = AV83Unidadi[AV88Lincol2-1] ;
            AV97RecPrdLin2 = AV81RecPrdNum[AV88Lincol2-1] ;
            AV96FacConLin2 = AV82FacCon[AV88Lincol2-1] ;
            AV95RecDscLin2 = AV84RecPrdDsc[AV88Lincol2-1] ;
            AV80Nlin = (short)(AV80Nlin+1) ;
            h6Z20( false, 17) ;
            getPrinter().GxAttris("Tahoma", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV90UniLin1, "")), 355, Gx_line+1, 381, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV91RecDscLin1, "")), 73, Gx_line+1, 209, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV92FacConLin1, "ZZZZZ.ZZZZZ")), 270, Gx_line+1, 351, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV93RecPrdLin1, "")), 18, Gx_line+0, 68, Gx_line+17, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV94UniLin2, "")), 736, Gx_line+1, 762, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV95RecDscLin2, "")), 456, Gx_line+0, 592, Gx_line+16, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV96FacConLin2, "ZZZZZ.ZZZZZ")), 651, Gx_line+0, 732, Gx_line+16, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV97RecPrdLin2, "")), 401, Gx_line+0, 451, Gx_line+17, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(389, Gx_line+0, 389, Gx_line+17, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
            if ( AV89LinPag == 20 )
            {
               if ( ( AV87Lincol1 <= AV86TLin ) && ( AV88Lincol2 <= AV86TLin ) )
               {
                  AV87Lincol1 = (short)(AV87Lincol1+20) ;
                  AV88Lincol2 = (short)(AV88Lincol2+20) ;
                  AV89LinPag = (byte)(1) ;
                  /* Eject command */
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(P_lines+1) ;
               }
               else
               {
                  AV89LinPag = (byte)(1) ;
                  if (true) break;
               }
            }
            AV87Lincol1 = (short)(AV87Lincol1+1) ;
            AV88Lincol2 = (short)(AV88Lincol2+1) ;
            AV89LinPag = (byte)(AV89LinPag+1) ;
         }
         h6Z20( false, 17) ;
         getPrinter().GxAttris("Arial", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV66ContDsc, "")), 7, Gx_line+3, 91, Gx_line+16, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawLine(4, Gx_line+0, 770, Gx_line+0, 1, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+17) ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6Z20( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void h6Z20( boolean bFoot ,
                      int Inc )
   {
      /* Skip the required number of lines */
      while ( ( ToSkip > 0 ) || ( Gx_line + Inc > P_lines ) )
      {
         if ( Gx_line + Inc >= P_lines )
         {
            if ( Gx_page > 0 )
            {
               /* Print footers */
               Gx_line = P_lines ;
               getPrinter().GxEndPage() ;
               if ( bFoot )
               {
                  return  ;
               }
            }
            ToSkip = 0 ;
            Gx_line = 0 ;
            Gx_page = (int)(Gx_page+1) ;
            /* Skip Margin Top Lines */
            Gx_line = (int)(Gx_line+(M_top*lineHeight)) ;
            /* Print headers */
            getPrinter().GxStartPage() ;
            getPrinter().setPage(Gx_page);
            getPrinter().GxDrawLine(2, Gx_line+36, 768, Gx_line+36, 2, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10ForSer, "")), 448, Gx_line+72, 582, Gx_line+93, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11ForColNom, "")), 619, Gx_line+46, 728, Gx_line+67, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27Lit5, "")), 7, Gx_line+74, 74, Gx_line+91, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28Lit6, "")), 303, Gx_line+48, 372, Gx_line+66, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 493, Gx_line+16, 548, Gx_line+32, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 554, Gx_line+16, 655, Gx_line+32, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 717, Gx_line+16, 762, Gx_line+32, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55ArtDsc, "")), 448, Gx_line+116, 666, Gx_line+137, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(2, Gx_line+42, 765, Gx_line+162, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV76ForTonal, "")), 382, Gx_line+46, 550, Gx_line+67, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "FICHA DE MUESTRAS", ""), 5, Gx_line+13, 187, Gx_line+33, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV77TipArtDsc, "")), 448, Gx_line+94, 699, Gx_line+115, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Processos", ""), 7, Gx_line+145, 71, Gx_line+160, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV78Tab_pro[1-1], "")), 93, Gx_line+145, 169, Gx_line+161, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV78Tab_pro[2-1], "")), 191, Gx_line+145, 267, Gx_line+161, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV78Tab_pro[3-1], "")), 290, Gx_line+145, 366, Gx_line+161, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV78Tab_pro[4-1], "")), 389, Gx_line+145, 465, Gx_line+161, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV78Tab_pro[5-1], "")), 486, Gx_line+145, 562, Gx_line+161, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 18, Gx_line+168, 78, Gx_line+183, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(18, Gx_line+184, 263, Gx_line+184, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cantidad", ""), 288, Gx_line+167, 346, Gx_line+182, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(270, Gx_line+184, 381, Gx_line+184, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 401, Gx_line+167, 461, Gx_line+182, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(401, Gx_line+184, 646, Gx_line+184, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cantidad", ""), 676, Gx_line+167, 734, Gx_line+182, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(650, Gx_line+184, 761, Gx_line+184, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(389, Gx_line+160, 389, Gx_line+188, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV78Tab_pro[6-1], "")), 584, Gx_line+145, 660, Gx_line+161, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pagina", ""), 668, Gx_line+16, 712, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Dia-Hora", ""), 420, Gx_line+16, 476, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+70, 763, Gx_line+70, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(2, Gx_line+141, 763, Gx_line+141, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "MacroProceso", ""), 7, Gx_line+122, 97, Gx_line+137, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV101MacProCod, "")), 102, Gx_line+122, 178, Gx_line+138, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV100MacProDsc, "")), 185, Gx_line+122, 290, Gx_line+138, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(2, Gx_line+116, 394, Gx_line+142, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+189) ;
            if (true) break;
         }
         else
         {
            PrtOffset = 0 ;
            Gx_line = (int)(Gx_line+1) ;
         }
         ToSkip = (int)(ToSkip-1) ;
      }
      getPrinter().setPage(Gx_page);
   }

   protected void cleanup( )
   {
      this.aP0[0] = rficcol2.this.A396EmprCod;
      this.aP1[0] = rficcol2.this.A910Workstat;
      this.aP2[0] = rficcol2.this.AV9CliCod;
      this.aP3[0] = rficcol2.this.AV10ForSer;
      this.aP4[0] = rficcol2.this.AV11ForColNom;
      this.aP5[0] = rficcol2.this.AV12ForColNum;
      this.aP6[0] = rficcol2.this.AV13TipColCod;
      this.aP7[0] = rficcol2.this.AV14TotKilos;
      this.aP8[0] = rficcol2.this.AV15Volumen;
      this.aP9[0] = rficcol2.this.AV16MaqCod;
      this.aP10[0] = rficcol2.this.AV53Incre;
      this.aP11[0] = rficcol2.this.AV21TotKilo;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV66ContDsc = "" ;
      GXv_int2 = new byte[1] ;
      AV31Lit0 = "" ;
      AV32Lit1 = "" ;
      AV24Lit2 = "" ;
      AV33Lit3 = "" ;
      AV26Lit4 = "" ;
      AV27Lit5 = "" ;
      AV28Lit6 = "" ;
      AV29Lit7 = "" ;
      AV30Lit8 = "" ;
      AV34Lit9 = "" ;
      AV35Lit10 = "" ;
      AV36Lit11 = "" ;
      AV37Lit12 = "" ;
      AV38Lit13 = "" ;
      AV39Lit14 = "" ;
      AV40Lit15 = "" ;
      AV45Lit16 = "" ;
      AV42Lit17 = "" ;
      AV43Lit18 = "" ;
      AV44Lit19 = "" ;
      AV51Lit20 = "" ;
      AV52Lit21 = "" ;
      AV54Lit22 = "" ;
      AV61Lit23 = "" ;
      AV62Lit24 = "" ;
      AV63Lit25 = "" ;
      AV69Lit26 = "" ;
      AV75Lit27 = "" ;
      GXt_char3 = "" ;
      GXv_char1 = new String[1] ;
      scmdbuf = "" ;
      P06Z22_A396EmprCod = new String[] {""} ;
      P06Z22_A831TipColCod = new byte[1] ;
      P06Z22_A483ForColNum = new int[1] ;
      P06Z22_A482ForColNom = new String[] {""} ;
      P06Z22_A494ForSer = new String[] {""} ;
      P06Z22_A252CliCod = new int[1] ;
      P06Z22_A1191ForNomCli = new String[] {""} ;
      P06Z22_n1191ForNomCli = new boolean[] {false} ;
      P06Z22_A583IntCod = new byte[1] ;
      P06Z22_A584IntDsc = new String[] {""} ;
      P06Z22_n584IntDsc = new boolean[] {false} ;
      P06Z22_A832TipColDsc = new String[] {""} ;
      P06Z22_n832TipColDsc = new boolean[] {false} ;
      P06Z22_A279CliNom = new String[] {""} ;
      P06Z22_A1192ForNumCli = new int[1] ;
      P06Z22_n1192ForNumCli = new boolean[] {false} ;
      P06Z22_A995ForTonal = new String[] {""} ;
      P06Z22_n995ForTonal = new boolean[] {false} ;
      P06Z22_A626MatCod = new short[1] ;
      P06Z22_A627MatDsc = new String[] {""} ;
      P06Z22_n627MatDsc = new boolean[] {false} ;
      P06Z22_A1515MacProDsc = new String[] {""} ;
      P06Z22_A1514MacProCod = new String[] {""} ;
      P06Z22_n1514MacProCod = new boolean[] {false} ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A1191ForNomCli = "" ;
      A584IntDsc = "" ;
      A832TipColDsc = "" ;
      A279CliNom = "" ;
      A995ForTonal = "" ;
      A627MatDsc = "" ;
      A1515MacProDsc = "" ;
      A1514MacProCod = "" ;
      AV46ForNomCli = "" ;
      AV49IntDsc = "" ;
      AV50TipColDsc = "" ;
      AV64CliNom = "" ;
      AV76ForTonal = "" ;
      AV68matDsc = "" ;
      AV100MacProDsc = "" ;
      AV101MacProCod = "" ;
      AV78Tab_pro = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV78Tab_pro[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P06Z23_A396EmprCod = new String[] {""} ;
      P06Z23_A252CliCod = new int[1] ;
      P06Z23_A494ForSer = new String[] {""} ;
      P06Z23_A482ForColNom = new String[] {""} ;
      P06Z23_A483ForColNum = new int[1] ;
      P06Z23_A831TipColCod = new byte[1] ;
      P06Z23_A764ProForCod = new String[] {""} ;
      P06Z23_A1160ProForL = new short[1] ;
      A764ProForCod = "" ;
      P06Z24_A829TipArtCod = new short[1] ;
      P06Z24_A396EmprCod = new String[] {""} ;
      P06Z24_A65ArtCod = new String[] {""} ;
      P06Z24_A252CliCod = new int[1] ;
      P06Z24_A69ArtDsc = new String[] {""} ;
      P06Z24_n69ArtDsc = new boolean[] {false} ;
      P06Z24_A830TipArtDsc = new String[] {""} ;
      P06Z24_n830TipArtDsc = new boolean[] {false} ;
      A65ArtCod = "" ;
      A69ArtDsc = "" ;
      A830TipArtDsc = "" ;
      AV55ArtDsc = "" ;
      AV77TipArtDsc = "" ;
      P06Z25_A396EmprCod = new String[] {""} ;
      P06Z25_A407EmprNom = new String[] {""} ;
      P06Z25_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV25NomEmp = "" ;
      AV81RecPrdNum = new String[230] ;
      GX_I = 1 ;
      while ( GX_I <= 230 )
      {
         AV81RecPrdNum[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV82FacCon = new java.math.BigDecimal[230] ;
      GX_I = 1 ;
      while ( GX_I <= 230 )
      {
         AV82FacCon[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV83Unidadi = new String[230] ;
      GX_I = 1 ;
      while ( GX_I <= 230 )
      {
         AV83Unidadi[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV84RecPrdDsc = new String[230] ;
      GX_I = 1 ;
      while ( GX_I <= 230 )
      {
         AV84RecPrdDsc[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P06Z26_A396EmprCod = new String[] {""} ;
      P06Z26_A910Workstat = new String[] {""} ;
      P06Z26_A719PrdNum = new String[] {""} ;
      P06Z26_A490ForPrdUMe = new byte[1] ;
      P06Z26_A897EscMDsc = new String[] {""} ;
      P06Z26_A718PrdNom = new String[] {""} ;
      P06Z26_A887EscMLin = new int[1] ;
      A719PrdNum = "" ;
      A897EscMDsc = "" ;
      A718PrdNom = "" ;
      AV85Var2 = "" ;
      AV90UniLin1 = "" ;
      AV93RecPrdLin1 = "" ;
      AV92FacConLin1 = DecimalUtil.ZERO ;
      AV91RecDscLin1 = "" ;
      AV94UniLin2 = "" ;
      AV97RecPrdLin2 = "" ;
      AV96FacConLin2 = DecimalUtil.ZERO ;
      AV95RecDscLin2 = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rficcol2__default(),
         new Object[] {
             new Object[] {
            P06Z22_A396EmprCod, P06Z22_A831TipColCod, P06Z22_A483ForColNum, P06Z22_A482ForColNom, P06Z22_A494ForSer, P06Z22_A252CliCod, P06Z22_A1191ForNomCli, P06Z22_n1191ForNomCli, P06Z22_A583IntCod, P06Z22_A584IntDsc,
            P06Z22_n584IntDsc, P06Z22_A832TipColDsc, P06Z22_n832TipColDsc, P06Z22_A279CliNom, P06Z22_A1192ForNumCli, P06Z22_n1192ForNumCli, P06Z22_A995ForTonal, P06Z22_n995ForTonal, P06Z22_A626MatCod, P06Z22_A627MatDsc,
            P06Z22_n627MatDsc, P06Z22_A1515MacProDsc, P06Z22_A1514MacProCod, P06Z22_n1514MacProCod
            }
            , new Object[] {
            P06Z23_A396EmprCod, P06Z23_A252CliCod, P06Z23_A494ForSer, P06Z23_A482ForColNom, P06Z23_A483ForColNum, P06Z23_A831TipColCod, P06Z23_A764ProForCod, P06Z23_A1160ProForL
            }
            , new Object[] {
            P06Z24_A829TipArtCod, P06Z24_A396EmprCod, P06Z24_A65ArtCod, P06Z24_A252CliCod, P06Z24_A69ArtDsc, P06Z24_n69ArtDsc, P06Z24_A830TipArtDsc, P06Z24_n830TipArtDsc
            }
            , new Object[] {
            P06Z25_A396EmprCod, P06Z25_A407EmprNom, P06Z25_n407EmprNom
            }
            , new Object[] {
            P06Z26_A396EmprCod, P06Z26_A910Workstat, P06Z26_A719PrdNum, P06Z26_A490ForPrdUMe, P06Z26_A897EscMDsc, P06Z26_A718PrdNom, P06Z26_A887EscMLin
            }
         }
      );
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV13TipColCod ;
   private byte AV71FlagUni ;
   private byte GXv_int2[] ;
   private byte A831TipColCod ;
   private byte A583IntCod ;
   private byte AV48IntCod ;
   private byte A490ForPrdUMe ;
   private byte AV89LinPag ;
   private short A626MatCod ;
   private short AV67MatCod ;
   private short AV79j ;
   private short A1160ProForL ;
   private short A829TipArtCod ;
   private short AV80Nlin ;
   private short AV86TLin ;
   private short AV87Lincol1 ;
   private short AV88Lincol2 ;
   private short Gx_err ;
   private int AV9CliCod ;
   private int AV12ForColNum ;
   private int AV15Volumen ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private int A1192ForNumCli ;
   private int AV47ForNumCli ;
   private int GX_I ;
   private int A887EscMLin ;
   private int Gx_OldLine ;
   private java.math.BigDecimal AV14TotKilos ;
   private java.math.BigDecimal AV53Incre ;
   private java.math.BigDecimal AV21TotKilo ;
   private java.math.BigDecimal AV82FacCon[] ;
   private java.math.BigDecimal AV92FacConLin1 ;
   private java.math.BigDecimal AV96FacConLin2 ;
   private String A396EmprCod ;
   private String A910Workstat ;
   private String AV10ForSer ;
   private String AV11ForColNom ;
   private String AV16MaqCod ;
   private String AV66ContDsc ;
   private String AV31Lit0 ;
   private String AV32Lit1 ;
   private String AV24Lit2 ;
   private String AV33Lit3 ;
   private String AV26Lit4 ;
   private String AV27Lit5 ;
   private String AV28Lit6 ;
   private String AV29Lit7 ;
   private String AV30Lit8 ;
   private String AV34Lit9 ;
   private String AV35Lit10 ;
   private String AV36Lit11 ;
   private String AV37Lit12 ;
   private String AV38Lit13 ;
   private String AV39Lit14 ;
   private String AV40Lit15 ;
   private String AV45Lit16 ;
   private String AV42Lit17 ;
   private String AV43Lit18 ;
   private String AV44Lit19 ;
   private String AV51Lit20 ;
   private String AV52Lit21 ;
   private String AV54Lit22 ;
   private String AV61Lit23 ;
   private String AV62Lit24 ;
   private String AV63Lit25 ;
   private String AV69Lit26 ;
   private String AV75Lit27 ;
   private String GXt_char3 ;
   private String GXv_char1[] ;
   private String scmdbuf ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A1191ForNomCli ;
   private String A584IntDsc ;
   private String A832TipColDsc ;
   private String A279CliNom ;
   private String A995ForTonal ;
   private String A627MatDsc ;
   private String A1515MacProDsc ;
   private String A1514MacProCod ;
   private String AV46ForNomCli ;
   private String AV49IntDsc ;
   private String AV50TipColDsc ;
   private String AV64CliNom ;
   private String AV76ForTonal ;
   private String AV68matDsc ;
   private String AV100MacProDsc ;
   private String AV101MacProCod ;
   private String AV78Tab_pro[] ;
   private String A764ProForCod ;
   private String A65ArtCod ;
   private String A69ArtDsc ;
   private String A830TipArtDsc ;
   private String AV55ArtDsc ;
   private String AV77TipArtDsc ;
   private String A407EmprNom ;
   private String AV25NomEmp ;
   private String AV81RecPrdNum[] ;
   private String AV83Unidadi[] ;
   private String AV84RecPrdDsc[] ;
   private String A719PrdNum ;
   private String A897EscMDsc ;
   private String A718PrdNom ;
   private String AV85Var2 ;
   private String AV90UniLin1 ;
   private String AV93RecPrdLin1 ;
   private String AV91RecDscLin1 ;
   private String AV94UniLin2 ;
   private String AV97RecPrdLin2 ;
   private String AV95RecDscLin2 ;
   private String Gx_time ;
   private java.util.Date Gx_date ;
   private boolean n1191ForNomCli ;
   private boolean n584IntDsc ;
   private boolean n832TipColDsc ;
   private boolean n1192ForNumCli ;
   private boolean n995ForTonal ;
   private boolean n627MatDsc ;
   private boolean n1514MacProCod ;
   private boolean n69ArtDsc ;
   private boolean n830TipArtDsc ;
   private boolean n407EmprNom ;
   private java.math.BigDecimal[] aP11 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private int[] aP5 ;
   private byte[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private int[] aP8 ;
   private String[] aP9 ;
   private java.math.BigDecimal[] aP10 ;
   private IDataStoreProvider pr_default ;
   private String[] P06Z22_A396EmprCod ;
   private byte[] P06Z22_A831TipColCod ;
   private int[] P06Z22_A483ForColNum ;
   private String[] P06Z22_A482ForColNom ;
   private String[] P06Z22_A494ForSer ;
   private int[] P06Z22_A252CliCod ;
   private String[] P06Z22_A1191ForNomCli ;
   private boolean[] P06Z22_n1191ForNomCli ;
   private byte[] P06Z22_A583IntCod ;
   private String[] P06Z22_A584IntDsc ;
   private boolean[] P06Z22_n584IntDsc ;
   private String[] P06Z22_A832TipColDsc ;
   private boolean[] P06Z22_n832TipColDsc ;
   private String[] P06Z22_A279CliNom ;
   private int[] P06Z22_A1192ForNumCli ;
   private boolean[] P06Z22_n1192ForNumCli ;
   private String[] P06Z22_A995ForTonal ;
   private boolean[] P06Z22_n995ForTonal ;
   private short[] P06Z22_A626MatCod ;
   private String[] P06Z22_A627MatDsc ;
   private boolean[] P06Z22_n627MatDsc ;
   private String[] P06Z22_A1515MacProDsc ;
   private String[] P06Z22_A1514MacProCod ;
   private boolean[] P06Z22_n1514MacProCod ;
   private String[] P06Z23_A396EmprCod ;
   private int[] P06Z23_A252CliCod ;
   private String[] P06Z23_A494ForSer ;
   private String[] P06Z23_A482ForColNom ;
   private int[] P06Z23_A483ForColNum ;
   private byte[] P06Z23_A831TipColCod ;
   private String[] P06Z23_A764ProForCod ;
   private short[] P06Z23_A1160ProForL ;
   private short[] P06Z24_A829TipArtCod ;
   private String[] P06Z24_A396EmprCod ;
   private String[] P06Z24_A65ArtCod ;
   private int[] P06Z24_A252CliCod ;
   private String[] P06Z24_A69ArtDsc ;
   private boolean[] P06Z24_n69ArtDsc ;
   private String[] P06Z24_A830TipArtDsc ;
   private boolean[] P06Z24_n830TipArtDsc ;
   private String[] P06Z25_A396EmprCod ;
   private String[] P06Z25_A407EmprNom ;
   private boolean[] P06Z25_n407EmprNom ;
   private String[] P06Z26_A396EmprCod ;
   private String[] P06Z26_A910Workstat ;
   private String[] P06Z26_A719PrdNum ;
   private byte[] P06Z26_A490ForPrdUMe ;
   private String[] P06Z26_A897EscMDsc ;
   private String[] P06Z26_A718PrdNom ;
   private int[] P06Z26_A887EscMLin ;
}

final  class rficcol2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06Z22", "SELECT T1.EmprCod, T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSer, T1.CliCod, T1.ForNomCli, T1.IntCod, T3.IntDsc, T5.TipColDsc, T2.CliNom, T1.ForNumCli, T1.ForTonal, T1.MatCod, T4.MatDsc, T6.MacProDsc, T1.MacProCod FROM (((((TXPCFORMU T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) INNER JOIN TXPINTENS T3 ON T3.EmprCod = T1.EmprCod AND T3.IntCod = T1.IntCod) INNER JOIN TXPMATICE T4 ON T4.EmprCod = T1.EmprCod AND T4.MatCod = T1.MatCod) INNER JOIN TXPTIPCOL T5 ON T5.EmprCod = T1.EmprCod AND T5.TipColCod = T1.TipColCod) LEFT JOIN TXPCMACPR T6 ON T6.EmprCod = T1.EmprCod AND T6.MacProCod = T1.MacProCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ForSer = ? and T1.ForColNom = ? and T1.ForColNum = ? and T1.TipColCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06Z23", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ProForCod, ProForL FROM TXPLFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ProForL ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06Z24", "SELECT T1.TipArtCod, T1.EmprCod, T1.ArtCod, T1.CliCod, T1.ArtDsc, T2.TipArtDsc FROM (TXPARTICU T1 INNER JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND T2.TipArtCod = T1.TipArtCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06Z25", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06Z26", "SELECT T1.EmprCod, T1.Workstat, T1.PrdNum, T1.ForPrdUMe, T1.EscMDsc, T2.PrdNom, T1.EscMLin FROM (TXPESCMAN T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.Workstat = ? ORDER BY T1.EmprCod, T1.Workstat, T1.EscMLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 30);
               ((int[]) buf[14])[0] = rslt.getInt(12);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(13, 20);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(14);
               ((String[]) buf[19])[0] = rslt.getString(15, 30);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(16, 20);
               ((String[]) buf[22])[0] = rslt.getString(17, 6);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((int[]) buf[6])[0] = rslt.getInt(7);
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
      }
   }

}

