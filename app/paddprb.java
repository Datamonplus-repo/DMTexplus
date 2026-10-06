package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class paddprb extends GXProcedure
{
   public paddprb( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( paddprb.class ), "" );
   }

   public paddprb( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           String[] aP1 ,
                                           short[] aP2 ,
                                           int[] aP3 ,
                                           int[] aP4 ,
                                           byte[] aP5 ,
                                           String[] aP6 ,
                                           String[] aP7 ,
                                           String[] aP8 ,
                                           short[] aP9 ,
                                           int[] aP10 ,
                                           java.math.BigDecimal[] aP11 ,
                                           short[] aP12 )
   {
      paddprb.this.aP13 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
      return aP13[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        short[] aP2 ,
                        int[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 ,
                        short[] aP9 ,
                        int[] aP10 ,
                        java.math.BigDecimal[] aP11 ,
                        short[] aP12 ,
                        java.math.BigDecimal[] aP13 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             short[] aP2 ,
                             int[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             short[] aP9 ,
                             int[] aP10 ,
                             java.math.BigDecimal[] aP11 ,
                             short[] aP12 ,
                             java.math.BigDecimal[] aP13 )
   {
      paddprb.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      paddprb.this.AV21TermiCod = aP1[0];
      this.aP1 = aP1;
      paddprb.this.AV22BarLinMaq = aP2[0];
      this.aP2 = aP2;
      paddprb.this.AV23BarMaqVol = aP3[0];
      this.aP3 = aP3;
      paddprb.this.AV16BarCod = aP4[0];
      this.aP4 = aP4;
      paddprb.this.AV17BarCodReo = aP5[0];
      this.aP5 = aP5;
      paddprb.this.AV18BarCodPar = aP6[0];
      this.aP6 = aP6;
      paddprb.this.AV19ProForCod = aP7[0];
      this.aP7 = aP7;
      paddprb.this.AV24BarMaqCod = aP8[0];
      this.aP8 = aP8;
      paddprb.this.AV20Linea = aP9[0];
      this.aP9 = aP9;
      paddprb.this.AV25BarPrfPrg = aP10[0];
      this.aP10 = aP10;
      paddprb.this.AV26BarPrfRb = aP11[0];
      this.aP11 = aP11;
      paddprb.this.AV28BarPrfh2o = aP12[0];
      this.aP12 = aP12;
      paddprb.this.AV27Kg = aP13[0];
      this.aP13 = aP13;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /*
         INSERT RECORD ON TABLE TXPBARPR2

      */
      A396EmprCod = AV15EmprCod ;
      A2792TermiCod = AV21TermiCod ;
      A129BarCod = AV16BarCod ;
      A132BarCodReo = AV17BarCodReo ;
      A130BarCodPar = AV18BarCodPar ;
      A2794BarLinMaq = AV22BarLinMaq ;
      A1255BarPrfLin = AV20Linea ;
      A207BarPrfCod = AV19ProForCod ;
      n207BarPrfCod = false ;
      A4871BarPrfPrg = AV25BarPrfPrg ;
      n4871BarPrfPrg = false ;
      A7254BarPrfRb = AV26BarPrfRb ;
      n7254BarPrfRb = false ;
      if ( AV26BarPrfRb.doubleValue() > 0 )
      {
         A4869BarPrfVol = (int)(DecimalUtil.decToDouble(GXutil.roundDecimal( AV26BarPrfRb.multiply(AV27Kg), 0))) ;
         n4869BarPrfVol = false ;
      }
      else
      {
         A4869BarPrfVol = AV23BarMaqVol ;
         n4869BarPrfVol = false ;
      }
      A10543BarPrfH2O = AV28BarPrfh2o ;
      n10543BarPrfH2O = false ;
      /* Using cursor P005H2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A2792TermiCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2794BarLinMaq), Short.valueOf(A1255BarPrfLin), Boolean.valueOf(n207BarPrfCod), A207BarPrfCod, Boolean.valueOf(n4869BarPrfVol), Integer.valueOf(A4869BarPrfVol), Boolean.valueOf(n4871BarPrfPrg), Integer.valueOf(A4871BarPrfPrg), Boolean.valueOf(n7254BarPrfRb), A7254BarPrfRb, Boolean.valueOf(n10543BarPrfH2O), Short.valueOf(A10543BarPrfH2O)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPR2");
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
      this.aP0[0] = paddprb.this.AV15EmprCod;
      this.aP1[0] = paddprb.this.AV21TermiCod;
      this.aP2[0] = paddprb.this.AV22BarLinMaq;
      this.aP3[0] = paddprb.this.AV23BarMaqVol;
      this.aP4[0] = paddprb.this.AV16BarCod;
      this.aP5[0] = paddprb.this.AV17BarCodReo;
      this.aP6[0] = paddprb.this.AV18BarCodPar;
      this.aP7[0] = paddprb.this.AV19ProForCod;
      this.aP8[0] = paddprb.this.AV24BarMaqCod;
      this.aP9[0] = paddprb.this.AV20Linea;
      this.aP10[0] = paddprb.this.AV25BarPrfPrg;
      this.aP11[0] = paddprb.this.AV26BarPrfRb;
      this.aP12[0] = paddprb.this.AV28BarPrfh2o;
      this.aP13[0] = paddprb.this.AV27Kg;
      Application.commitDataStores(context, remoteHandle, pr_default, "paddprb");
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
      A2792TermiCod = "" ;
      A130BarCodPar = "" ;
      A207BarPrfCod = "" ;
      A7254BarPrfRb = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.paddprb__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17BarCodReo ;
   private byte A132BarCodReo ;
   private short AV22BarLinMaq ;
   private short AV20Linea ;
   private short AV28BarPrfh2o ;
   private short A2794BarLinMaq ;
   private short A1255BarPrfLin ;
   private short A10543BarPrfH2O ;
   private short Gx_err ;
   private int AV23BarMaqVol ;
   private int AV16BarCod ;
   private int AV25BarPrfPrg ;
   private int GX_INS407 ;
   private int A129BarCod ;
   private int A4871BarPrfPrg ;
   private int A4869BarPrfVol ;
   private java.math.BigDecimal AV26BarPrfRb ;
   private java.math.BigDecimal AV27Kg ;
   private java.math.BigDecimal A7254BarPrfRb ;
   private String AV15EmprCod ;
   private String AV21TermiCod ;
   private String AV18BarCodPar ;
   private String AV19ProForCod ;
   private String AV24BarMaqCod ;
   private String A396EmprCod ;
   private String A2792TermiCod ;
   private String A130BarCodPar ;
   private String A207BarPrfCod ;
   private String Gx_emsg ;
   private boolean n207BarPrfCod ;
   private boolean n4871BarPrfPrg ;
   private boolean n7254BarPrfRb ;
   private boolean n4869BarPrfVol ;
   private boolean n10543BarPrfH2O ;
   private java.math.BigDecimal[] aP13 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private short[] aP2 ;
   private int[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private String[] aP8 ;
   private short[] aP9 ;
   private int[] aP10 ;
   private java.math.BigDecimal[] aP11 ;
   private short[] aP12 ;
   private IDataStoreProvider pr_default ;
}

final  class paddprb__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P005H2", "INSERT INTO TXPBARPR2(EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar, BarLinMaq, BarPrfLin, BarPrfCod, BarPrfVol, BarPrfPrg, BarPrfRb, BarPrfH2O, BarPrfTie, BarPrfTmp, BarPrfPhx, BarPrfPhm, BarPrfRec) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPR2")
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
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[8], 6);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[10]).intValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[12]).intValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[14], 2);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[16]).shortValue());
               }
               return;
      }
   }

}

