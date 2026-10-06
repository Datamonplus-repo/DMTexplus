package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprofoi extends GXProcedure
{
   public pprofoi( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprofoi.class ), "" );
   }

   public pprofoi( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            String[] aP1 )
   {
      pprofoi.this.aP2 = new short[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        short[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             short[] aP2 )
   {
      pprofoi.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprofoi.this.A764ProForCod = aP1[0];
      this.aP1 = aP1;
      pprofoi.this.AV18IntCodF2 = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_char1[0] = A396EmprCod ;
      GXv_char2[0] = "030100" ;
      GXv_int3[0] = AV22ValCos ;
      new app.pbuscou(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_int3) ;
      pprofoi.this.A396EmprCod = GXv_char1[0] ;
      pprofoi.this.AV22ValCos = GXv_int3[0] ;
      AV16Cost_color = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P01RO2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A764ProForCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A770ProForPrd = P01RO2_A770ProForPrd[0] ;
         A762ProForCan = P01RO2_A762ProForCan[0] ;
         A767ProForLin = P01RO2_A767ProForLin[0] ;
         AV21LenVar = (byte)(GXutil.len( A770ProForPrd)) ;
         if ( ( GXutil.strcmp(GXutil.substring( A770ProForPrd, 1, 1), "1") >= 0 ) && ( GXutil.strcmp(GXutil.substring( A770ProForPrd, 1, 1), "7") <= 0 ) && ( ( AV21LenVar == 5 ) || ( AV21LenVar == 6 ) ) )
         {
            AV17PrdNum = A770ProForPrd ;
            /* Execute user subroutine: 'PRODUC' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV16Cost_color = AV16Cost_color.add(((DecimalUtil.doubleToDec(AV22ValCos).multiply(A762ProForCan).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)).multiply(AV19PrdPreAct).multiply(AV20PrdFacCon))) ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV18IntCodF2 = (short)(0) ;
      /* Using cursor P01RO3 */
      pr_default.execute(1, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A5436IntCodF2 = P01RO3_A5436IntCodF2[0] ;
         A5439IntLabF2f = P01RO3_A5439IntLabF2f[0] ;
         n5439IntLabF2f = P01RO3_n5439IntLabF2f[0] ;
         A5438IntLabF2i = P01RO3_A5438IntLabF2i[0] ;
         n5438IntLabF2i = P01RO3_n5438IntLabF2i[0] ;
         if ( ( DecimalUtil.compareTo(A5438IntLabF2i, AV16Cost_color) <= 0 ) && ( DecimalUtil.compareTo(A5439IntLabF2f, AV16Cost_color) >= 0 ) )
         {
            AV18IntCodF2 = A5436IntCodF2 ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
      cleanup();
   }

   public void S111( )
   {
      /* 'PRODUC' Routine */
      returnInSub = false ;
      AV20PrdFacCon = DecimalUtil.doubleToDec(0) ;
      AV19PrdPreAct = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P01RO4 */
      pr_default.execute(2, new Object[] {A396EmprCod, AV17PrdNum});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A719PrdNum = P01RO4_A719PrdNum[0] ;
         A724PrdPreAct = P01RO4_A724PrdPreAct[0] ;
         A707PrdFacCon = P01RO4_A707PrdFacCon[0] ;
         AV19PrdPreAct = A724PrdPreAct ;
         AV20PrdFacCon = A707PrdFacCon ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprofoi.this.A396EmprCod;
      this.aP1[0] = pprofoi.this.A764ProForCod;
      this.aP2[0] = pprofoi.this.AV18IntCodF2;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_char1 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new int[1] ;
      AV16Cost_color = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P01RO2_A396EmprCod = new String[] {""} ;
      P01RO2_A764ProForCod = new String[] {""} ;
      P01RO2_A770ProForPrd = new String[] {""} ;
      P01RO2_A762ProForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01RO2_A767ProForLin = new short[1] ;
      A770ProForPrd = "" ;
      A762ProForCan = DecimalUtil.ZERO ;
      AV17PrdNum = "" ;
      AV19PrdPreAct = DecimalUtil.ZERO ;
      AV20PrdFacCon = DecimalUtil.ZERO ;
      P01RO3_A396EmprCod = new String[] {""} ;
      P01RO3_A5436IntCodF2 = new short[1] ;
      P01RO3_A5439IntLabF2f = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01RO3_n5439IntLabF2f = new boolean[] {false} ;
      P01RO3_A5438IntLabF2i = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01RO3_n5438IntLabF2i = new boolean[] {false} ;
      A5439IntLabF2f = DecimalUtil.ZERO ;
      A5438IntLabF2i = DecimalUtil.ZERO ;
      P01RO4_A396EmprCod = new String[] {""} ;
      P01RO4_A719PrdNum = new String[] {""} ;
      P01RO4_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01RO4_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A719PrdNum = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprofoi__default(),
         new Object[] {
             new Object[] {
            P01RO2_A396EmprCod, P01RO2_A764ProForCod, P01RO2_A770ProForPrd, P01RO2_A762ProForCan, P01RO2_A767ProForLin
            }
            , new Object[] {
            P01RO3_A396EmprCod, P01RO3_A5436IntCodF2, P01RO3_A5439IntLabF2f, P01RO3_n5439IntLabF2f, P01RO3_A5438IntLabF2i, P01RO3_n5438IntLabF2i
            }
            , new Object[] {
            P01RO4_A396EmprCod, P01RO4_A719PrdNum, P01RO4_A724PrdPreAct, P01RO4_A707PrdFacCon
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV21LenVar ;
   private short AV18IntCodF2 ;
   private short A767ProForLin ;
   private short A5436IntCodF2 ;
   private short Gx_err ;
   private int AV22ValCos ;
   private int GXv_int3[] ;
   private java.math.BigDecimal AV16Cost_color ;
   private java.math.BigDecimal A762ProForCan ;
   private java.math.BigDecimal AV19PrdPreAct ;
   private java.math.BigDecimal AV20PrdFacCon ;
   private java.math.BigDecimal A5439IntLabF2f ;
   private java.math.BigDecimal A5438IntLabF2i ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A707PrdFacCon ;
   private String A396EmprCod ;
   private String A764ProForCod ;
   private String GXv_char1[] ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A770ProForPrd ;
   private String AV17PrdNum ;
   private String A719PrdNum ;
   private boolean returnInSub ;
   private boolean n5439IntLabF2f ;
   private boolean n5438IntLabF2i ;
   private short[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P01RO2_A396EmprCod ;
   private String[] P01RO2_A764ProForCod ;
   private String[] P01RO2_A770ProForPrd ;
   private java.math.BigDecimal[] P01RO2_A762ProForCan ;
   private short[] P01RO2_A767ProForLin ;
   private String[] P01RO3_A396EmprCod ;
   private short[] P01RO3_A5436IntCodF2 ;
   private java.math.BigDecimal[] P01RO3_A5439IntLabF2f ;
   private boolean[] P01RO3_n5439IntLabF2f ;
   private java.math.BigDecimal[] P01RO3_A5438IntLabF2i ;
   private boolean[] P01RO3_n5438IntLabF2i ;
   private String[] P01RO4_A396EmprCod ;
   private String[] P01RO4_A719PrdNum ;
   private java.math.BigDecimal[] P01RO4_A724PrdPreAct ;
   private java.math.BigDecimal[] P01RO4_A707PrdFacCon ;
}

final  class pprofoi__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01RO2", "SELECT EmprCod, ProForCod, ProForPrd, ProForCan, ProForLin FROM TXPLPROFO WHERE EmprCod = ? and ProForCod = ? ORDER BY EmprCod, ProForCod, ProForLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01RO3", "SELECT EmprCod, IntCodF2, IntLabF2f, IntLabF2i FROM TXPINTFA2 WHERE (EmprCod = ? and IntCodF2 >= 0) AND (IntCodF2 <= 9999) ORDER BY EmprCod, IntCodF2 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01RO4", "SELECT EmprCod, PrdNum, PrdPreAct, PrdFacCon FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

