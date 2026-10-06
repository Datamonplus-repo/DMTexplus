package app.pedidos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class insdisfas extends GXProcedure
{
   public insdisfas( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( insdisfas.class ), "" );
   }

   public insdisfas( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        short aP3 ,
                        String aP4 ,
                        String aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             short aP3 ,
                             String aP4 ,
                             String aP5 )
   {
      insdisfas.this.A396EmprCod = aP0;
      insdisfas.this.AV10Discod = aP1;
      insdisfas.this.AV11Procod = aP2;
      insdisfas.this.AV8Disfaslin = aP3;
      insdisfas.this.AV9FasCod = aP4;
      insdisfas.this.AV12DisFasObs = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15GXLvl3 = (byte)(0) ;
      /* Optimized UPDATE. */
      /* Using cursor P0A822 */
      pr_default.execute(0, new Object[] {AV12DisFasObs, AV9FasCod, A396EmprCod, Integer.valueOf(AV10Discod), AV11Procod, Short.valueOf(AV8Disfaslin)});
      if ( (pr_default.getStatus(0) != 101) )
      {
         AV15GXLvl3 = (byte)(1) ;
      }
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISFAS");
      /* End optimized UPDATE. */
      if ( AV15GXLvl3 == 0 )
      {
         /*
            INSERT RECORD ON TABLE TXPDISFAS

         */
         /* Using cursor P0A823 */
         pr_default.execute(1, new Object[] {A396EmprCod, A457FasCod});
         A469FasPreSal = P0A823_A469FasPreSal[0] ;
         n469FasPreSal = P0A823_n469FasPreSal[0] ;
         A468FasPrePie = P0A823_A468FasPrePie[0] ;
         n468FasPrePie = P0A823_n468FasPrePie[0] ;
         A472FasVelPro = P0A823_A472FasVelPro[0] ;
         n472FasVelPro = P0A823_n472FasVelPro[0] ;
         A464FasNumPas = P0A823_A464FasNumPas[0] ;
         n464FasNumPas = P0A823_n464FasNumPas[0] ;
         pr_default.close(1);
         A361DisCod = AV10Discod ;
         A758ProCod = AV11Procod ;
         A368DisFasLin = AV8Disfaslin ;
         A457FasCod = AV9FasCod ;
         A9841DisFasObs = AV12DisFasObs ;
         A3793DisMaqPru = "" ;
         n3793DisMaqPru = false ;
         A5304DisPreSal = A469FasPreSal ;
         n5304DisPreSal = false ;
         A5305DisPrePie = A468FasPrePie ;
         n5305DisPrePie = false ;
         A5306DisVelPro = A472FasVelPro ;
         n5306DisVelPro = false ;
         A5307DisNumPas = A464FasNumPas ;
         n5307DisNumPas = false ;
         A5376DisQuiUl = (short)(0) ;
         A7740DisFasPre = DecimalUtil.doubleToDec(0) ;
         n7740DisFasPre = false ;
         A7741DisFasUni = "" ;
         n7741DisFasUni = false ;
         A7742DisFasDto = DecimalUtil.doubleToDec(0) ;
         n7742DisFasDto = false ;
         A7743DisFasRec = DecimalUtil.doubleToDec(0) ;
         n7743DisFasRec = false ;
         A7747DisFasAut = (byte)(0) ;
         n7747DisFasAut = false ;
         A7744FasPreObl = (byte)(0) ;
         n7744FasPreObl = false ;
         /* Using cursor P0A824 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), A457FasCod, A3697FasApr, Boolean.valueOf(n3793DisMaqPru), A3793DisMaqPru, Short.valueOf(A5376DisQuiUl), Boolean.valueOf(n7740DisFasPre), A7740DisFasPre, Boolean.valueOf(n7741DisFasUni), A7741DisFasUni, Boolean.valueOf(n7742DisFasDto), A7742DisFasDto, Boolean.valueOf(n7743DisFasRec), A7743DisFasRec, Boolean.valueOf(n7747DisFasAut), Byte.valueOf(A7747DisFasAut), A9841DisFasObs, Boolean.valueOf(n5304DisPreSal), Short.valueOf(A5304DisPreSal), Boolean.valueOf(n5305DisPrePie), Short.valueOf(A5305DisPrePie), Boolean.valueOf(n5306DisVelPro), A5306DisVelPro, Boolean.valueOf(n5307DisNumPas), Short.valueOf(A5307DisNumPas), Boolean.valueOf(n7744FasPreObl), Byte.valueOf(A7744FasPreObl)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISFAS");
         if ( (pr_default.getStatus(2) == 1) )
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
      }
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "pedidos.insdisfas");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
      pr_default.close(1);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A9841DisFasObs = "" ;
      A457FasCod = "" ;
      scmdbuf = "" ;
      P0A823_A469FasPreSal = new short[1] ;
      P0A823_n469FasPreSal = new boolean[] {false} ;
      P0A823_A468FasPrePie = new short[1] ;
      P0A823_n468FasPrePie = new boolean[] {false} ;
      P0A823_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A823_n472FasVelPro = new boolean[] {false} ;
      P0A823_A464FasNumPas = new short[1] ;
      P0A823_n464FasNumPas = new boolean[] {false} ;
      A472FasVelPro = DecimalUtil.ZERO ;
      A758ProCod = "" ;
      A3697FasApr = "" ;
      A3793DisMaqPru = "" ;
      A5306DisVelPro = DecimalUtil.ZERO ;
      A7740DisFasPre = DecimalUtil.ZERO ;
      A7741DisFasUni = "" ;
      A7742DisFasDto = DecimalUtil.ZERO ;
      A7743DisFasRec = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidos.insdisfas__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            P0A823_A469FasPreSal, P0A823_n469FasPreSal, P0A823_A468FasPrePie, P0A823_n468FasPrePie, P0A823_A472FasVelPro, P0A823_n472FasVelPro, P0A823_A464FasNumPas, P0A823_n464FasNumPas
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV15GXLvl3 ;
   private byte A7747DisFasAut ;
   private byte A7744FasPreObl ;
   private short AV8Disfaslin ;
   private short A469FasPreSal ;
   private short A468FasPrePie ;
   private short A464FasNumPas ;
   private short A368DisFasLin ;
   private short A5304DisPreSal ;
   private short A5305DisPrePie ;
   private short A5307DisNumPas ;
   private short A5376DisQuiUl ;
   private short Gx_err ;
   private int AV10Discod ;
   private int GX_INS39 ;
   private int A361DisCod ;
   private java.math.BigDecimal A472FasVelPro ;
   private java.math.BigDecimal A5306DisVelPro ;
   private java.math.BigDecimal A7740DisFasPre ;
   private java.math.BigDecimal A7742DisFasDto ;
   private java.math.BigDecimal A7743DisFasRec ;
   private String A396EmprCod ;
   private String AV11Procod ;
   private String AV9FasCod ;
   private String A457FasCod ;
   private String scmdbuf ;
   private String A758ProCod ;
   private String A3697FasApr ;
   private String A3793DisMaqPru ;
   private String A7741DisFasUni ;
   private String Gx_emsg ;
   private boolean n469FasPreSal ;
   private boolean n468FasPrePie ;
   private boolean n472FasVelPro ;
   private boolean n464FasNumPas ;
   private boolean n3793DisMaqPru ;
   private boolean n5304DisPreSal ;
   private boolean n5305DisPrePie ;
   private boolean n5306DisVelPro ;
   private boolean n5307DisNumPas ;
   private boolean n7740DisFasPre ;
   private boolean n7741DisFasUni ;
   private boolean n7742DisFasDto ;
   private boolean n7743DisFasRec ;
   private boolean n7747DisFasAut ;
   private boolean n7744FasPreObl ;
   private String AV12DisFasObs ;
   private String A9841DisFasObs ;
   private IDataStoreProvider pr_default ;
   private short[] P0A823_A469FasPreSal ;
   private boolean[] P0A823_n469FasPreSal ;
   private short[] P0A823_A468FasPrePie ;
   private boolean[] P0A823_n468FasPrePie ;
   private java.math.BigDecimal[] P0A823_A472FasVelPro ;
   private boolean[] P0A823_n472FasVelPro ;
   private short[] P0A823_A464FasNumPas ;
   private boolean[] P0A823_n464FasNumPas ;
}

final  class insdisfas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P0A822", "UPDATE TXPDISFAS SET DisFasObs=?, FasCod=?  WHERE EmprCod = ? and DisCod = ? and ProCod = ? and DisFasLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISFAS")
         ,new ForEachCursor("P0A823", "SELECT FasPreSal, FasPrePie, FasVelPro, FasNumPas FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P0A824", "INSERT INTO TXPDISFAS(EmprCod, DisCod, ProCod, DisFasLin, FasCod, FasApr, DisMaqPru, DisQuiUl, DisFasPre, DisFasUni, DisFasDto, DisFasRec, DisFasAut, DisFasObs, DisPreSal, DisPrePie, DisVelPro, DisNumPas, FasPreObl, Disfastpp, DisFasUpL, DisfasRb, Dta_UOrd) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISFAS")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(3,1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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
               stmt.setVarchar(1, (String)parms[0], 3000, false);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 1);
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[7], 6);
               }
               stmt.setShort(8, ((Number) parms[8]).shortValue());
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[10], 2);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[12], 1);
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
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[16], 2);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(13, ((Number) parms[18]).byteValue());
               }
               stmt.setVarchar(14, (String)parms[19], 3000, false);
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(15, ((Number) parms[21]).shortValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[23]).shortValue());
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(17, (java.math.BigDecimal)parms[25], 1);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(18, ((Number) parms[27]).shortValue());
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(19, ((Number) parms[29]).byteValue());
               }
               return;
      }
   }

}

