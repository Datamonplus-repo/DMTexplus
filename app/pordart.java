package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pordart extends GXProcedure
{
   public pordart( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pordart.class ), "" );
   }

   public pordart( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             short[] aP3 ,
                             String[] aP4 ,
                             java.math.BigDecimal[] aP5 )
   {
      pordart.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        short[] aP3 ,
                        String[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             short[] aP3 ,
                             String[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             String[] aP6 )
   {
      pordart.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pordart.this.AV15PSer = aP1[0];
      this.aP1 = aP1;
      pordart.this.AV16USer = aP2[0];
      this.aP2 = aP2;
      pordart.this.AV17Anyo = aP3[0];
      this.aP3 = aP3;
      pordart.this.AV18Prio = aP4[0];
      this.aP4 = aP4;
      pordart.this.AV19TotCom = aP5[0];
      this.aP5 = aP5;
      pordart.this.AV20ArtEstSer = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      n900ArtOrd0 = false ;
      /* Optimized UPDATE. */
      /* Using cursor P00552 */
      pr_default.execute(0, new Object[] {A396EmprCod});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCESART");
      /* End optimized UPDATE. */
      AV19TotCom = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P00553 */
      pr_default.execute(1, new Object[] {A396EmprCod, AV15PSer, Short.valueOf(AV17Anyo), AV20ArtEstSer, AV16USer});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk553 = false ;
         A71ArtEstAny = P00553_A71ArtEstAny[0] ;
         A2756ArtEstSer = P00553_A2756ArtEstSer[0] ;
         A65ArtCod = P00553_A65ArtCod[0] ;
         A1436ArtImp0 = P00553_A1436ArtImp0[0] ;
         n1436ArtImp0 = P00553_n1436ArtImp0[0] ;
         A1437ArtImp1 = P00553_A1437ArtImp1[0] ;
         n1437ArtImp1 = P00553_n1437ArtImp1[0] ;
         A72ArtEstMes = P00553_A72ArtEstMes[0] ;
         A252CliCod = P00553_A252CliCod[0] ;
         AV24TAcuImp0 = DecimalUtil.doubleToDec(0) ;
         AV25TAcuImp1 = DecimalUtil.doubleToDec(0) ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P00553_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P00553_A65ArtCod[0], A65ArtCod) == 0 ) && ( P00553_A71ArtEstAny[0] == A71ArtEstAny ) && ( GXutil.strcmp(P00553_A2756ArtEstSer[0], A2756ArtEstSer) == 0 ) )
         {
            brk553 = false ;
            A1436ArtImp0 = P00553_A1436ArtImp0[0] ;
            n1436ArtImp0 = P00553_n1436ArtImp0[0] ;
            A1437ArtImp1 = P00553_A1437ArtImp1[0] ;
            n1437ArtImp1 = P00553_n1437ArtImp1[0] ;
            A72ArtEstMes = P00553_A72ArtEstMes[0] ;
            A252CliCod = P00553_A252CliCod[0] ;
            if ( ( GXutil.strcmp(A65ArtCod, AV15PSer) >= 0 ) && ( GXutil.strcmp(A65ArtCod, AV16USer) <= 0 ) )
            {
               if ( A1436ArtImp0.doubleValue() < 0 )
               {
                  AV22AcuImp0 = A1436ArtImp0.negate() ;
               }
               else
               {
                  AV22AcuImp0 = A1436ArtImp0 ;
               }
               if ( A1437ArtImp1.doubleValue() < 0 )
               {
                  AV23AcuImp1 = A1437ArtImp1.negate() ;
               }
               else
               {
                  AV23AcuImp1 = A1437ArtImp1 ;
               }
               AV24TAcuImp0 = AV24TAcuImp0.add(AV22AcuImp0) ;
               AV25TAcuImp1 = AV25TAcuImp1.add(AV23AcuImp1) ;
               if ( GXutil.strcmp(AV18Prio, "2") == 0 )
               {
                  AV19TotCom = AV19TotCom.add(A1436ArtImp0).add(A1437ArtImp1) ;
               }
               else
               {
                  if ( GXutil.strcmp(AV18Prio, "0") == 0 )
                  {
                     AV19TotCom = AV19TotCom.add(A1436ArtImp0) ;
                  }
                  else
                  {
                     AV19TotCom = AV19TotCom.add(A1437ArtImp1) ;
                  }
               }
            }
            brk553 = true ;
            pr_default.readNext(1);
         }
         AV26ArtCod = A65ArtCod ;
         /* Execute user subroutine: 'ACTU_CESART' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( ! brk553 )
         {
            brk553 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
      cleanup();
   }

   public void S111( )
   {
      /* 'ACTU_CESART' Routine */
      returnInSub = false ;
      /* Using cursor P00554 */
      pr_default.execute(2, new Object[] {A396EmprCod, AV26ArtCod, Short.valueOf(AV17Anyo), AV20ArtEstSer});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A2756ArtEstSer = P00554_A2756ArtEstSer[0] ;
         A71ArtEstAny = P00554_A71ArtEstAny[0] ;
         A65ArtCod = P00554_A65ArtCod[0] ;
         A900ArtOrd0 = P00554_A900ArtOrd0[0] ;
         n900ArtOrd0 = P00554_n900ArtOrd0[0] ;
         A252CliCod = P00554_A252CliCod[0] ;
         if ( GXutil.strcmp(AV18Prio, "2") == 0 )
         {
            A900ArtOrd0 = DecimalUtil.stringToDec("9999999999.99").subtract(AV24TAcuImp0).subtract(AV25TAcuImp1) ;
            n900ArtOrd0 = false ;
         }
         else
         {
            if ( GXutil.strcmp(AV18Prio, "0") == 0 )
            {
               A900ArtOrd0 = DecimalUtil.stringToDec("9999999999.99").subtract(AV24TAcuImp0) ;
               n900ArtOrd0 = false ;
            }
            if ( GXutil.strcmp(AV18Prio, "1") == 0 )
            {
               A900ArtOrd0 = DecimalUtil.stringToDec("9999999999.99").subtract(AV25TAcuImp1) ;
               n900ArtOrd0 = false ;
            }
         }
         /* Using cursor P00555 */
         pr_default.execute(3, new Object[] {Boolean.valueOf(n900ArtOrd0), A900ArtOrd0, A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Short.valueOf(A71ArtEstAny), A2756ArtEstSer});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCESART");
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pordart.this.A396EmprCod;
      this.aP1[0] = pordart.this.AV15PSer;
      this.aP2[0] = pordart.this.AV16USer;
      this.aP3[0] = pordart.this.AV17Anyo;
      this.aP4[0] = pordart.this.AV18Prio;
      this.aP5[0] = pordart.this.AV19TotCom;
      this.aP6[0] = pordart.this.AV20ArtEstSer;
      Application.commitDataStores(context, remoteHandle, pr_default, "pordart");
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
      P00553_A396EmprCod = new String[] {""} ;
      P00553_A71ArtEstAny = new short[1] ;
      P00553_A2756ArtEstSer = new String[] {""} ;
      P00553_A65ArtCod = new String[] {""} ;
      P00553_A1436ArtImp0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00553_n1436ArtImp0 = new boolean[] {false} ;
      P00553_A1437ArtImp1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00553_n1437ArtImp1 = new boolean[] {false} ;
      P00553_A72ArtEstMes = new byte[1] ;
      P00553_A252CliCod = new int[1] ;
      A2756ArtEstSer = "" ;
      A65ArtCod = "" ;
      A1436ArtImp0 = DecimalUtil.ZERO ;
      A1437ArtImp1 = DecimalUtil.ZERO ;
      AV24TAcuImp0 = DecimalUtil.ZERO ;
      AV25TAcuImp1 = DecimalUtil.ZERO ;
      AV22AcuImp0 = DecimalUtil.ZERO ;
      AV23AcuImp1 = DecimalUtil.ZERO ;
      AV26ArtCod = "" ;
      P00554_A396EmprCod = new String[] {""} ;
      P00554_A2756ArtEstSer = new String[] {""} ;
      P00554_A71ArtEstAny = new short[1] ;
      P00554_A65ArtCod = new String[] {""} ;
      P00554_A900ArtOrd0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00554_n900ArtOrd0 = new boolean[] {false} ;
      P00554_A252CliCod = new int[1] ;
      A900ArtOrd0 = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pordart__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            P00553_A396EmprCod, P00553_A71ArtEstAny, P00553_A2756ArtEstSer, P00553_A65ArtCod, P00553_A1436ArtImp0, P00553_n1436ArtImp0, P00553_A1437ArtImp1, P00553_n1437ArtImp1, P00553_A72ArtEstMes, P00553_A252CliCod
            }
            , new Object[] {
            P00554_A396EmprCod, P00554_A2756ArtEstSer, P00554_A71ArtEstAny, P00554_A65ArtCod, P00554_A900ArtOrd0, P00554_n900ArtOrd0, P00554_A252CliCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A72ArtEstMes ;
   private short AV17Anyo ;
   private short A71ArtEstAny ;
   private short Gx_err ;
   private int A252CliCod ;
   private java.math.BigDecimal AV19TotCom ;
   private java.math.BigDecimal A1436ArtImp0 ;
   private java.math.BigDecimal A1437ArtImp1 ;
   private java.math.BigDecimal AV24TAcuImp0 ;
   private java.math.BigDecimal AV25TAcuImp1 ;
   private java.math.BigDecimal AV22AcuImp0 ;
   private java.math.BigDecimal AV23AcuImp1 ;
   private java.math.BigDecimal A900ArtOrd0 ;
   private String A396EmprCod ;
   private String AV15PSer ;
   private String AV16USer ;
   private String AV18Prio ;
   private String AV20ArtEstSer ;
   private String scmdbuf ;
   private String A2756ArtEstSer ;
   private String A65ArtCod ;
   private String AV26ArtCod ;
   private boolean n900ArtOrd0 ;
   private boolean brk553 ;
   private boolean n1436ArtImp0 ;
   private boolean n1437ArtImp1 ;
   private boolean returnInSub ;
   private String[] aP6 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private short[] aP3 ;
   private String[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P00553_A396EmprCod ;
   private short[] P00553_A71ArtEstAny ;
   private String[] P00553_A2756ArtEstSer ;
   private String[] P00553_A65ArtCod ;
   private java.math.BigDecimal[] P00553_A1436ArtImp0 ;
   private boolean[] P00553_n1436ArtImp0 ;
   private java.math.BigDecimal[] P00553_A1437ArtImp1 ;
   private boolean[] P00553_n1437ArtImp1 ;
   private byte[] P00553_A72ArtEstMes ;
   private int[] P00553_A252CliCod ;
   private String[] P00554_A396EmprCod ;
   private String[] P00554_A2756ArtEstSer ;
   private short[] P00554_A71ArtEstAny ;
   private String[] P00554_A65ArtCod ;
   private java.math.BigDecimal[] P00554_A900ArtOrd0 ;
   private boolean[] P00554_n900ArtOrd0 ;
   private int[] P00554_A252CliCod ;
}

final  class pordart__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P00552", "UPDATE TXPCESART SET ArtOrd0=9999999999.99  WHERE EmprCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCESART")
         ,new ForEachCursor("P00553", "SELECT EmprCod, ArtEstAny, ArtEstSer, ArtCod, ArtImp0, ArtImp1, ArtEstMes, CliCod FROM TXPLESART WHERE (EmprCod = ? and ArtCod >= ? and ArtEstAny = ? and ArtEstSer = ?) AND (ArtCod <= ?) ORDER BY EmprCod, ArtCod, ArtEstAny, ArtEstSer ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00554", "SELECT EmprCod, ArtEstSer, ArtEstAny, ArtCod, ArtOrd0, CliCod FROM TXPCESART WHERE (EmprCod = ?) AND (ArtCod = ?) AND (ArtEstAny = ?) AND (ArtEstSer = ?) ORDER BY EmprCod, CliCod, ArtCod, ArtEstAny, ArtEstSer ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00555", "UPDATE TXPCESART SET ArtOrd0=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ArtEstAny = ? AND ArtEstSer = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCESART")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               ((int[]) buf[9])[0] = rslt.getInt(8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(6);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setString(5, (String)parms[4], 16);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 16);
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               stmt.setString(6, (String)parms[6], 3);
               return;
      }
   }

}

