package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfacau13 extends GXProcedure
{
   public pfacau13( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfacau13.class ), "" );
   }

   public pfacau13( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           int[] aP2 ,
                                           java.util.Date[] aP3 ,
                                           String[] aP4 ,
                                           String[] aP5 ,
                                           java.math.BigDecimal[] aP6 ,
                                           java.math.BigDecimal[] aP7 ,
                                           int[] aP8 ,
                                           byte[] aP9 ,
                                           String[] aP10 ,
                                           String[] aP11 ,
                                           String[] aP12 ,
                                           String[] aP13 ,
                                           byte[] aP14 ,
                                           java.math.BigDecimal[] aP15 ,
                                           String[] aP16 ,
                                           byte[] aP17 ,
                                           String[] aP18 ,
                                           String[] aP19 ,
                                           java.math.BigDecimal[] aP20 ,
                                           java.util.Date[] aP21 ,
                                           String[] aP22 )
   {
      pfacau13.this.aP23 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23);
      return aP23[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        java.util.Date[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        int[] aP8 ,
                        byte[] aP9 ,
                        String[] aP10 ,
                        String[] aP11 ,
                        String[] aP12 ,
                        String[] aP13 ,
                        byte[] aP14 ,
                        java.math.BigDecimal[] aP15 ,
                        String[] aP16 ,
                        byte[] aP17 ,
                        String[] aP18 ,
                        String[] aP19 ,
                        java.math.BigDecimal[] aP20 ,
                        java.util.Date[] aP21 ,
                        String[] aP22 ,
                        java.math.BigDecimal[] aP23 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             java.util.Date[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             int[] aP8 ,
                             byte[] aP9 ,
                             String[] aP10 ,
                             String[] aP11 ,
                             String[] aP12 ,
                             String[] aP13 ,
                             byte[] aP14 ,
                             java.math.BigDecimal[] aP15 ,
                             String[] aP16 ,
                             byte[] aP17 ,
                             String[] aP18 ,
                             String[] aP19 ,
                             java.math.BigDecimal[] aP20 ,
                             java.util.Date[] aP21 ,
                             String[] aP22 ,
                             java.math.BigDecimal[] aP23 )
   {
      pfacau13.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfacau13.this.AV23NumFac = aP1[0];
      this.aP1 = aP1;
      pfacau13.this.AV75CliFac = aP2[0];
      this.aP2 = aP2;
      pfacau13.this.AV21FacFch = aP3[0];
      this.aP3 = aP3;
      pfacau13.this.AV20PRIO = aP4[0];
      this.aP4 = aP4;
      pfacau13.this.AV26CodFpg = aP5[0];
      this.aP5 = aP5;
      pfacau13.this.AV27DtoGen = aP6[0];
      this.aP6 = aP6;
      pfacau13.this.AV28DtoPP = aP7[0];
      this.aP7 = aP7;
      pfacau13.this.AV24NumLin = aP8[0];
      this.aP8 = aP8;
      pfacau13.this.AV30CliNroVto = aP9[0];
      this.aP9 = aP9;
      pfacau13.this.AV31CliPrd = aP10[0];
      this.aP10 = aP10;
      pfacau13.this.AV32CliDiaPag = aP11[0];
      this.aP11 = aP11;
      pfacau13.this.AV29RegIVA = aP12[0];
      this.aP12 = aP12;
      pfacau13.this.AV107IvaCod = aP13[0];
      this.aP13 = aP13;
      pfacau13.this.AV108IvaPor = aP14[0];
      this.aP14 = aP14;
      pfacau13.this.AV109IvaRec = aP15[0];
      this.aP15 = aP15;
      pfacau13.this.AV22FacSerNum = aP16[0];
      this.aP16 = aP16;
      pfacau13.this.AV76FacDivCod = aP17[0];
      this.aP17 = aP17;
      pfacau13.this.AV83RepCod = aP18[0];
      this.aP18 = aP18;
      pfacau13.this.AV79Extranjero = aP19[0];
      this.aP19 = aP19;
      pfacau13.this.AV111Clidto = aP20[0];
      this.aP20 = aP20;
      pfacau13.this.AV112FacHor = aP21[0];
      this.aP21 = aP21;
      pfacau13.this.AV113stMeivaId = aP22[0];
      this.aP22 = aP22;
      pfacau13.this.AV114Clienergia = aP23[0];
      this.aP23 = aP23;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV110Carvema ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CARVEM", ""), GXv_int2) ;
      pfacau13.this.GXt_int1 = GXv_int2[0] ;
      AV110Carvema = GXt_int1 ;
      AV25ContCod = "040100" ;
      if ( GXutil.strcmp(AV20PRIO, "1") == 0 )
      {
         AV25ContCod = "040200" ;
      }
      /*
         INSERT RECORD ON TABLE TXPCFAVEN

      */
      A430FacCod = AV23NumFac ;
      A252CliCod = AV75CliFac ;
      A436FacFch = AV21FacFch ;
      A450FacPri = AV20PRIO ;
      A437FacFpg = AV26CodFpg ;
      A433FacDtoGen = AV27DtoGen ;
      A434FacDtoPP = AV28DtoPP ;
      A6632FacDto = AV111Clidto ;
      if ( GXutil.strcmp(AV79Extranjero, httpContext.getMessage( "S", "")) == 0 )
      {
         A443FacIVAPor = (byte)(0) ;
         A453FacRECPor = DecimalUtil.doubleToDec(0) ;
      }
      else
      {
         if ( GXutil.strcmp(AV20PRIO, "1") == 0 )
         {
            A443FacIVAPor = AV108IvaPor ;
            if ( GXutil.strcmp(AV29RegIVA, httpContext.getMessage( "R", "")) == 0 )
            {
               A453FacRECPor = AV109IvaRec ;
            }
         }
      }
      A445FacLiC = AV24NumLin ;
      A1150FacNumVto = AV30CliNroVto ;
      A1151FacPer = AV31CliPrd ;
      A1152FacDiaPag = AV32CliDiaPag ;
      A960FacIVACod = AV107IvaCod ;
      A2739FacSerNum = AV22FacSerNum ;
      A965FacCob = " " ;
      A3115FacDivCod = AV76FacDivCod ;
      n3115FacDivCod = false ;
      A3096FacDivTCod = AV77FacDivTCod ;
      n3096FacDivTCod = false ;
      A435FacEst = (byte)(0) ;
      A1153FacTipFac = (byte)(0) ;
      A3119FacRepCod = AV83RepCod ;
      n3119FacRepCod = false ;
      A9606FacHor = AV112FacHor ;
      A11513FacRecIca = DecimalUtil.doubleToDec(0) ;
      A8346FacRecI = DecimalUtil.doubleToDec(0) ;
      n8346FacRecI = false ;
      A7212FacRect = DecimalUtil.doubleToDec(0) ;
      A11629MeivaId = AV113stMeivaId ;
      n11629MeivaId = false ;
      A14219FacEnergia = AV114Clienergia ;
      GXv_char3[0] = AV116facidate ;
      GXv_char4[0] = AV117FacSerAT ;
      GXv_char5[0] = AV115FacTipAT ;
      new app.patcud(remoteHandle, context).execute( A396EmprCod, AV25ContCod, GXv_char3, GXv_char4, GXv_char5, GXutil.trim( AV120Pgmdesc)) ;
      pfacau13.this.AV116facidate = GXv_char3[0] ;
      pfacau13.this.AV117FacSerAT = GXv_char4[0] ;
      pfacau13.this.AV115FacTipAT = GXv_char5[0] ;
      A14230FacIDATe = AV116facidate ;
      A14236FacSerAT = AV117FacSerAT ;
      A14237FacTipAT = AV115FacTipAT ;
      /* Using cursor P01UQ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod), A436FacFch, A450FacPri, Integer.valueOf(A252CliCod), A437FacFpg, A433FacDtoGen, A434FacDtoPP, Byte.valueOf(A443FacIVAPor), A453FacRECPor, Byte.valueOf(A435FacEst), Integer.valueOf(A445FacLiC), A960FacIVACod, A965FacCob, Byte.valueOf(A1150FacNumVto), A1151FacPer, A1152FacDiaPag, Byte.valueOf(A1153FacTipFac), A2739FacSerNum, Boolean.valueOf(n3096FacDivTCod), A3096FacDivTCod, Boolean.valueOf(n3115FacDivCod), Byte.valueOf(A3115FacDivCod), Boolean.valueOf(n3119FacRepCod), A3119FacRepCod, A6632FacDto, A7212FacRect, Boolean.valueOf(n8346FacRecI), A8346FacRecI, A9606FacHor, A11513FacRecIca, Boolean.valueOf(n11629MeivaId), A11629MeivaId, A14219FacEnergia, A14230FacIDATe, A14236FacSerAT, A14237FacTipAT});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFAVEN");
      if ( (pr_default.getStatus(0) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pfacau13.this.A396EmprCod;
      this.aP1[0] = pfacau13.this.AV23NumFac;
      this.aP2[0] = pfacau13.this.AV75CliFac;
      this.aP3[0] = pfacau13.this.AV21FacFch;
      this.aP4[0] = pfacau13.this.AV20PRIO;
      this.aP5[0] = pfacau13.this.AV26CodFpg;
      this.aP6[0] = pfacau13.this.AV27DtoGen;
      this.aP7[0] = pfacau13.this.AV28DtoPP;
      this.aP8[0] = pfacau13.this.AV24NumLin;
      this.aP9[0] = pfacau13.this.AV30CliNroVto;
      this.aP10[0] = pfacau13.this.AV31CliPrd;
      this.aP11[0] = pfacau13.this.AV32CliDiaPag;
      this.aP12[0] = pfacau13.this.AV29RegIVA;
      this.aP13[0] = pfacau13.this.AV107IvaCod;
      this.aP14[0] = pfacau13.this.AV108IvaPor;
      this.aP15[0] = pfacau13.this.AV109IvaRec;
      this.aP16[0] = pfacau13.this.AV22FacSerNum;
      this.aP17[0] = pfacau13.this.AV76FacDivCod;
      this.aP18[0] = pfacau13.this.AV83RepCod;
      this.aP19[0] = pfacau13.this.AV79Extranjero;
      this.aP20[0] = pfacau13.this.AV111Clidto;
      this.aP21[0] = pfacau13.this.AV112FacHor;
      this.aP22[0] = pfacau13.this.AV113stMeivaId;
      this.aP23[0] = pfacau13.this.AV114Clienergia;
      Application.commitDataStores(context, remoteHandle, pr_default, "facturacion.pfacau13");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new byte[1] ;
      AV25ContCod = "" ;
      A436FacFch = GXutil.nullDate() ;
      A450FacPri = "" ;
      A437FacFpg = "" ;
      A433FacDtoGen = DecimalUtil.ZERO ;
      A434FacDtoPP = DecimalUtil.ZERO ;
      A6632FacDto = DecimalUtil.ZERO ;
      A453FacRECPor = DecimalUtil.ZERO ;
      A1151FacPer = "" ;
      A1152FacDiaPag = "" ;
      A960FacIVACod = "" ;
      A2739FacSerNum = "" ;
      A965FacCob = "" ;
      A3096FacDivTCod = "" ;
      AV77FacDivTCod = "" ;
      A3119FacRepCod = "" ;
      A9606FacHor = GXutil.resetTime( GXutil.nullDate() );
      A11513FacRecIca = DecimalUtil.ZERO ;
      A8346FacRecI = DecimalUtil.ZERO ;
      A7212FacRect = DecimalUtil.ZERO ;
      A11629MeivaId = "" ;
      A14219FacEnergia = DecimalUtil.ZERO ;
      AV116facidate = "" ;
      GXv_char3 = new String[1] ;
      AV117FacSerAT = "" ;
      GXv_char4 = new String[1] ;
      AV115FacTipAT = "" ;
      GXv_char5 = new String[1] ;
      AV120Pgmdesc = "" ;
      A14230FacIDATe = "" ;
      A14236FacSerAT = "" ;
      A14237FacTipAT = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.pfacau13__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      AV120Pgmdesc = httpContext.getMessage( "TROZEO Pfacaut1", "") ;
      /* GeneXus formulas. */
      AV120Pgmdesc = httpContext.getMessage( "TROZEO Pfacaut1", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV30CliNroVto ;
   private byte AV108IvaPor ;
   private byte AV76FacDivCod ;
   private byte AV110Carvema ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A443FacIVAPor ;
   private byte A1150FacNumVto ;
   private byte A3115FacDivCod ;
   private byte A435FacEst ;
   private byte A1153FacTipFac ;
   private short Gx_err ;
   private int AV23NumFac ;
   private int AV75CliFac ;
   private int AV24NumLin ;
   private int GX_INS43 ;
   private int A430FacCod ;
   private int A252CliCod ;
   private int A445FacLiC ;
   private java.math.BigDecimal AV27DtoGen ;
   private java.math.BigDecimal AV28DtoPP ;
   private java.math.BigDecimal AV109IvaRec ;
   private java.math.BigDecimal AV111Clidto ;
   private java.math.BigDecimal AV114Clienergia ;
   private java.math.BigDecimal A433FacDtoGen ;
   private java.math.BigDecimal A434FacDtoPP ;
   private java.math.BigDecimal A6632FacDto ;
   private java.math.BigDecimal A453FacRECPor ;
   private java.math.BigDecimal A11513FacRecIca ;
   private java.math.BigDecimal A8346FacRecI ;
   private java.math.BigDecimal A7212FacRect ;
   private java.math.BigDecimal A14219FacEnergia ;
   private String A396EmprCod ;
   private String AV20PRIO ;
   private String AV26CodFpg ;
   private String AV31CliPrd ;
   private String AV32CliDiaPag ;
   private String AV29RegIVA ;
   private String AV107IvaCod ;
   private String AV22FacSerNum ;
   private String AV83RepCod ;
   private String AV79Extranjero ;
   private String AV113stMeivaId ;
   private String AV25ContCod ;
   private String A450FacPri ;
   private String A437FacFpg ;
   private String A1151FacPer ;
   private String A1152FacDiaPag ;
   private String A960FacIVACod ;
   private String A2739FacSerNum ;
   private String A965FacCob ;
   private String A3096FacDivTCod ;
   private String AV77FacDivTCod ;
   private String A3119FacRepCod ;
   private String A11629MeivaId ;
   private String AV116facidate ;
   private String GXv_char3[] ;
   private String AV117FacSerAT ;
   private String GXv_char4[] ;
   private String AV115FacTipAT ;
   private String GXv_char5[] ;
   private String AV120Pgmdesc ;
   private String A14230FacIDATe ;
   private String A14236FacSerAT ;
   private String A14237FacTipAT ;
   private String Gx_emsg ;
   private java.util.Date AV112FacHor ;
   private java.util.Date A9606FacHor ;
   private java.util.Date AV21FacFch ;
   private java.util.Date A436FacFch ;
   private boolean n3115FacDivCod ;
   private boolean n3096FacDivTCod ;
   private boolean n3119FacRepCod ;
   private boolean n8346FacRecI ;
   private boolean n11629MeivaId ;
   private java.math.BigDecimal[] aP23 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private java.util.Date[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private int[] aP8 ;
   private byte[] aP9 ;
   private String[] aP10 ;
   private String[] aP11 ;
   private String[] aP12 ;
   private String[] aP13 ;
   private byte[] aP14 ;
   private java.math.BigDecimal[] aP15 ;
   private String[] aP16 ;
   private byte[] aP17 ;
   private String[] aP18 ;
   private String[] aP19 ;
   private java.math.BigDecimal[] aP20 ;
   private java.util.Date[] aP21 ;
   private String[] aP22 ;
   private IDataStoreProvider pr_default ;
}

final  class pfacau13__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P01UQ2", "INSERT INTO TXPCFAVEN(EmprCod, FacCod, FacFch, FacPri, CliCod, FacFpg, FacDtoGen, FacDtoPP, FacIVAPor, FacRECPor, FacEst, FacLiC, FacIVACod, FacCob, FacNumVto, FacPer, FacDiaPag, FacTipFac, FacSerNum, FacDivTCod, FacDivCod, FacRepCod, FacDto, FacRect, FacRecI, FacHor, FacRecIca, MeivaId, FacEnergia, FacIDATe, FacSerAT, FacTipAT, FacRegIva, FacObs, Factrm, FacFirma, FacLiq1, FacLiq2, FacIva1, FacTot1, FacFirDg, FacCliPgL, FacAran, FacBrut, FacNet, FacInc, FacFre, FacExp, FacObs2, FacMan, FacTpFra, FacCostFac, FacCostMts, FacCostKgs, FacAnulada, FacFecAnul, MotAnuID, FacSFD, FacMsgATe, FacIDATc, FacMsgATc, FacIDATd, FacMsgATd, FacEnvMail) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', 0, ' ', 0, 0, 0, 0, ' ', 0, ' ', 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCFAVEN")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
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
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 2);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 3);
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setString(13, (String)parms[12], 3);
               stmt.setString(14, (String)parms[13], 1);
               stmt.setByte(15, ((Number) parms[14]).byteValue());
               stmt.setString(16, (String)parms[15], 5);
               stmt.setString(17, (String)parms[16], 6);
               stmt.setByte(18, ((Number) parms[17]).byteValue());
               stmt.setString(19, (String)parms[18], 3);
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[20], 1);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(21, ((Number) parms[22]).byteValue());
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[24], 6);
               }
               stmt.setBigDecimal(23, (java.math.BigDecimal)parms[25], 2);
               stmt.setBigDecimal(24, (java.math.BigDecimal)parms[26], 2);
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(25, (java.math.BigDecimal)parms[28], 2);
               }
               stmt.setDateTime(26, (java.util.Date)parms[29], false);
               stmt.setBigDecimal(27, (java.math.BigDecimal)parms[30], 3);
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(28, (String)parms[32], 4);
               }
               stmt.setBigDecimal(29, (java.math.BigDecimal)parms[33], 2);
               stmt.setString(30, (String)parms[34], 20);
               stmt.setString(31, (String)parms[35], 20);
               stmt.setString(32, (String)parms[36], 4);
               return;
      }
   }

}

