package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppedart7 extends GXProcedure
{
   public ppedart7( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppedart7.class ), "" );
   }

   public ppedart7( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            int[] aP2 ,
                            String[] AV8AlbRecPie ,
                            java.math.BigDecimal[] AV9DisPieKil ,
                            java.math.BigDecimal[] AV10DisPieMet ,
                            String[] aP6 ,
                            int[] aP7 ,
                            String[] aP8 ,
                            String[] aP9 ,
                            byte[] aP10 ,
                            byte[] aP11 ,
                            short[] aP12 )
   {
      ppedart7.this.aP13 = new short[] {0};
      execute_int(aP0, aP1, aP2, AV8AlbRecPie, AV9DisPieKil, AV10DisPieMet, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
      return aP13[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        String[] AV8AlbRecPie ,
                        java.math.BigDecimal[] AV9DisPieKil ,
                        java.math.BigDecimal[] AV10DisPieMet ,
                        String[] aP6 ,
                        int[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 ,
                        byte[] aP10 ,
                        byte[] aP11 ,
                        short[] aP12 ,
                        short[] aP13 )
   {
      execute_int(aP0, aP1, aP2, AV8AlbRecPie, AV9DisPieKil, AV10DisPieMet, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             String[] AV8AlbRecPie ,
                             java.math.BigDecimal[] AV9DisPieKil ,
                             java.math.BigDecimal[] AV10DisPieMet ,
                             String[] aP6 ,
                             int[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             byte[] aP10 ,
                             byte[] aP11 ,
                             short[] aP12 ,
                             short[] aP13 )
   {
      ppedart7.this.AV19EmprCod = aP0[0];
      this.aP0 = aP0;
      ppedart7.this.AV16ParId = aP1[0];
      this.aP1 = aP1;
      ppedart7.this.AV11PArCruRec = aP2[0];
      this.aP2 = aP2;
      ppedart7.this.AV8AlbRecPie = AV8AlbRecPie;
      ppedart7.this.AV9DisPieKil = AV9DisPieKil;
      ppedart7.this.AV10DisPieMet = AV10DisPieMet;
      ppedart7.this.AV13PArCruCol = aP6[0];
      this.aP6 = aP6;
      ppedart7.this.AV14PArCruColN = aP7[0];
      this.aP7 = aP7;
      ppedart7.this.AV12PArCruDib = aP8[0];
      this.aP8 = aP8;
      ppedart7.this.AV15PArCruPin = aP9[0];
      this.aP9 = aP9;
      ppedart7.this.AV21TipColCod = aP10[0];
      this.aP10 = aP10;
      ppedart7.this.AV20DesCol = aP11[0];
      this.aP11 = aP11;
      ppedart7.this.AV22ParCruLin = aP12[0];
      this.aP12 = aP12;
      ppedart7.this.AV18PArUltCru = aP13[0];
      this.aP13 = aP13;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV17Cont = (short)(1) ;
      while ( ( AV17Cont <= 999 ) && ( GXutil.strcmp(AV8AlbRecPie[AV17Cont-1], "") != 0 ) )
      {
         /*
            INSERT RECORD ON TABLE TXPPedAr1

         */
         A396EmprCod = AV19EmprCod ;
         A8197PArId = AV16ParId ;
         A8225ParCruLin = AV18PArUltCru ;
         A8226PArCruRec = AV11PArCruRec ;
         n8226PArCruRec = false ;
         A8230PArCruCol = AV13PArCruCol ;
         n8230PArCruCol = false ;
         A8231PArCruColN = AV14PArCruColN ;
         n8231PArCruColN = false ;
         A8232PArCruDib = AV12PArCruDib ;
         n8232PArCruDib = false ;
         A8233PArCruPin = AV15PArCruPin ;
         n8233PArCruPin = false ;
         A8229PArCruPie = AV8AlbRecPie[AV17Cont-1] ;
         n8229PArCruPie = false ;
         A8235ParCruKgs = AV9DisPieKil[AV17Cont-1] ;
         n8235ParCruKgs = false ;
         A8234PArCruMtr = AV10DisPieMet[AV17Cont-1] ;
         n8234PArCruMtr = false ;
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = A8197PArId ;
         GXv_char3[0] = A8230PArCruCol ;
         GXv_int4[0] = A8231PArCruColN ;
         GXv_int5[0] = AV21TipColCod ;
         GXv_char6[0] = A8232PArCruDib ;
         GXv_char7[0] = A8233PArCruPin ;
         GXv_decimal8[0] = A8234PArCruMtr ;
         GXv_decimal9[0] = A8235ParCruKgs ;
         GXv_char10[0] = "" ;
         GXv_int11[0] = 0 ;
         GXv_char12[0] = "" ;
         GXv_char13[0] = "" ;
         GXv_decimal14[0] = DecimalUtil.doubleToDec(0) ;
         GXv_decimal15[0] = DecimalUtil.doubleToDec(0) ;
         GXv_char16[0] = httpContext.getMessage( "INS", "") ;
         GXv_int17[0] = AV20DesCol ;
         new app.ppedart1(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_char3, GXv_int4, GXv_int5, GXv_char6, GXv_char7, GXv_decimal8, GXv_decimal9, GXv_char10, GXv_int11, GXv_char12, GXv_char13, GXv_decimal14, GXv_decimal15, GXv_char16, GXv_int17) ;
         ppedart7.this.A396EmprCod = GXv_char1[0] ;
         ppedart7.this.A8197PArId = GXv_int2[0] ;
         ppedart7.this.A8230PArCruCol = GXv_char3[0] ;
         ppedart7.this.A8231PArCruColN = GXv_int4[0] ;
         ppedart7.this.AV21TipColCod = GXv_int5[0] ;
         ppedart7.this.A8232PArCruDib = GXv_char6[0] ;
         ppedart7.this.A8233PArCruPin = GXv_char7[0] ;
         ppedart7.this.A8234PArCruMtr = GXv_decimal8[0] ;
         ppedart7.this.A8235ParCruKgs = GXv_decimal9[0] ;
         ppedart7.this.AV20DesCol = GXv_int17[0] ;
         /* Using cursor P037J2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A8197PArId), Short.valueOf(A8225ParCruLin), Boolean.valueOf(n8226PArCruRec), Integer.valueOf(A8226PArCruRec), Boolean.valueOf(n8229PArCruPie), A8229PArCruPie, Boolean.valueOf(n8230PArCruCol), A8230PArCruCol, Boolean.valueOf(n8231PArCruColN), Integer.valueOf(A8231PArCruColN), Boolean.valueOf(n8232PArCruDib), A8232PArCruDib, Boolean.valueOf(n8233PArCruPin), A8233PArCruPin, Boolean.valueOf(n8234PArCruMtr), A8234PArCruMtr, Boolean.valueOf(n8235ParCruKgs), A8235ParCruKgs});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPedAr1");
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
         AV18PArUltCru = (short)(AV18PArUltCru+1) ;
         AV17Cont = (short)(AV17Cont+1) ;
      }
      AV18PArUltCru = (short)(AV18PArUltCru-1) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppedart7.this.AV19EmprCod;
      this.aP1[0] = ppedart7.this.AV16ParId;
      this.aP2[0] = ppedart7.this.AV11PArCruRec;
      this.aP6[0] = ppedart7.this.AV13PArCruCol;
      this.aP7[0] = ppedart7.this.AV14PArCruColN;
      this.aP8[0] = ppedart7.this.AV12PArCruDib;
      this.aP9[0] = ppedart7.this.AV15PArCruPin;
      this.aP10[0] = ppedart7.this.AV21TipColCod;
      this.aP11[0] = ppedart7.this.AV20DesCol;
      this.aP12[0] = ppedart7.this.AV22ParCruLin;
      this.aP13[0] = ppedart7.this.AV18PArUltCru;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A396EmprCod = "" ;
      A8230PArCruCol = "" ;
      A8232PArCruDib = "" ;
      A8233PArCruPin = "" ;
      A8229PArCruPie = "" ;
      A8235ParCruKgs = DecimalUtil.ZERO ;
      A8234PArCruMtr = DecimalUtil.ZERO ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_int5 = new byte[1] ;
      GXv_char6 = new String[1] ;
      GXv_char7 = new String[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_char10 = new String[1] ;
      GXv_int11 = new int[1] ;
      GXv_char12 = new String[1] ;
      GXv_char13 = new String[1] ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      GXv_decimal15 = new java.math.BigDecimal[1] ;
      GXv_char16 = new String[1] ;
      GXv_int17 = new byte[1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppedart7__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV21TipColCod ;
   private byte AV20DesCol ;
   private byte GXv_int5[] ;
   private byte GXv_int17[] ;
   private short AV22ParCruLin ;
   private short AV18PArUltCru ;
   private short AV17Cont ;
   private short A8225ParCruLin ;
   private short Gx_err ;
   private int AV16ParId ;
   private int AV11PArCruRec ;
   private int AV14PArCruColN ;
   private int GX_INS1144 ;
   private int A8197PArId ;
   private int A8226PArCruRec ;
   private int A8231PArCruColN ;
   private int GXv_int2[] ;
   private int GXv_int4[] ;
   private int GXv_int11[] ;
   private java.math.BigDecimal AV9DisPieKil[] ;
   private java.math.BigDecimal AV10DisPieMet[] ;
   private java.math.BigDecimal A8235ParCruKgs ;
   private java.math.BigDecimal A8234PArCruMtr ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private java.math.BigDecimal GXv_decimal15[] ;
   private String AV19EmprCod ;
   private String AV8AlbRecPie[] ;
   private String AV13PArCruCol ;
   private String AV12PArCruDib ;
   private String AV15PArCruPin ;
   private String A396EmprCod ;
   private String A8230PArCruCol ;
   private String A8232PArCruDib ;
   private String A8233PArCruPin ;
   private String A8229PArCruPie ;
   private String GXv_char1[] ;
   private String GXv_char3[] ;
   private String GXv_char6[] ;
   private String GXv_char7[] ;
   private String GXv_char10[] ;
   private String GXv_char12[] ;
   private String GXv_char13[] ;
   private String GXv_char16[] ;
   private String Gx_emsg ;
   private boolean n8226PArCruRec ;
   private boolean n8230PArCruCol ;
   private boolean n8231PArCruColN ;
   private boolean n8232PArCruDib ;
   private boolean n8233PArCruPin ;
   private boolean n8229PArCruPie ;
   private boolean n8235ParCruKgs ;
   private boolean n8234PArCruMtr ;
   private short[] aP13 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private String[] aP6 ;
   private int[] aP7 ;
   private String[] aP8 ;
   private String[] aP9 ;
   private byte[] aP10 ;
   private byte[] aP11 ;
   private short[] aP12 ;
   private IDataStoreProvider pr_default ;
}

final  class ppedart7__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P037J2", "INSERT INTO TXPPedAr1(EmprCod, PArId, ParCruLin, PArCruRec, PArCruPie, PArCruCol, PArCruColN, PArCruDib, PArCruPin, PArCruMtr, ParCruKgs, PArCruPar) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPedAr1")
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[4]).intValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[6], 9);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[8], 13);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[10]).intValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[12], 16);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[14], 12);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[16], 2);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[18], 2);
               }
               return;
      }
   }

}

