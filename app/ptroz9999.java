package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ptroz9999 extends GXProcedure
{
   public ptroz9999( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ptroz9999.class ), "" );
   }

   public ptroz9999( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      ptroz9999.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      ptroz9999.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ptroz9999.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      ptroz9999.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      ptroz9999.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      ptroz9999.this.A200BarPieCod = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P04S72 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         W396EmprCod = A396EmprCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         W200BarPieCod = A200BarPieCod ;
         /*
            INSERT RECORD ON TABLE TXPBARTRO

         */
         W396EmprCod = A396EmprCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         W200BarPieCod = A200BarPieCod ;
         A3858BarTroCod = (short)(9999) ;
         A3859BarTroFec = GXutil.today( ) ;
         n3859BarTroFec = false ;
         A3860BarTroMet = DecimalUtil.doubleToDec(0) ;
         n3860BarTroMet = false ;
         A6556BarTroKil = DecimalUtil.doubleToDec(0) ;
         n6556BarTroKil = false ;
         A3861BarTroAnc = (short)(0) ;
         n3861BarTroAnc = false ;
         A3862BarTroIden = "" ;
         n3862BarTroIden = false ;
         A3733AlbTar = "" ;
         n3733AlbTar = false ;
         A3863BarTroFinP = (byte)(0) ;
         n3863BarTroFinP = false ;
         A3864BarTroEst = (byte)(0) ;
         n3864BarTroEst = false ;
         A4990BarTroCal = (byte)(0) ;
         n4990BarTroCal = false ;
         A4991BarTroOpeC = 0 ;
         n4991BarTroOpeC = false ;
         A4992BarTroUltD = (short)(0) ;
         n4992BarTroUltD = false ;
         A5622BarTroJau = (byte)(0) ;
         n5622BarTroJau = false ;
         A5623BarTroObs = "" ;
         n5623BarTroObs = false ;
         /* Using cursor P04S73 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A3858BarTroCod), Boolean.valueOf(n3859BarTroFec), A3859BarTroFec, Boolean.valueOf(n3860BarTroMet), A3860BarTroMet, Boolean.valueOf(n3861BarTroAnc), Short.valueOf(A3861BarTroAnc), Boolean.valueOf(n3862BarTroIden), A3862BarTroIden, Boolean.valueOf(n3733AlbTar), A3733AlbTar, Boolean.valueOf(n3863BarTroFinP), Byte.valueOf(A3863BarTroFinP), Boolean.valueOf(n3864BarTroEst), Byte.valueOf(A3864BarTroEst), Boolean.valueOf(n4990BarTroCal), Byte.valueOf(A4990BarTroCal), Boolean.valueOf(n4991BarTroOpeC), Integer.valueOf(A4991BarTroOpeC), Boolean.valueOf(n4992BarTroUltD), Short.valueOf(A4992BarTroUltD), Boolean.valueOf(n5622BarTroJau), Byte.valueOf(A5622BarTroJau), Boolean.valueOf(n5623BarTroObs), A5623BarTroObs, Boolean.valueOf(n6556BarTroKil), A6556BarTroKil});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARTRO");
         if ( (pr_default.getStatus(1) == 1) )
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
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         A200BarPieCod = W200BarPieCod ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         A200BarPieCod = W200BarPieCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ptroz9999.this.A396EmprCod;
      this.aP1[0] = ptroz9999.this.A129BarCod;
      this.aP2[0] = ptroz9999.this.A132BarCodReo;
      this.aP3[0] = ptroz9999.this.A130BarCodPar;
      this.aP4[0] = ptroz9999.this.A200BarPieCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "ptroz9999");
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
      P04S72_A396EmprCod = new String[] {""} ;
      P04S72_A129BarCod = new int[1] ;
      P04S72_A132BarCodReo = new byte[1] ;
      P04S72_A130BarCodPar = new String[] {""} ;
      P04S72_A200BarPieCod = new String[] {""} ;
      W396EmprCod = "" ;
      W130BarCodPar = "" ;
      W200BarPieCod = "" ;
      A3859BarTroFec = GXutil.nullDate() ;
      A3860BarTroMet = DecimalUtil.ZERO ;
      A6556BarTroKil = DecimalUtil.ZERO ;
      A3862BarTroIden = "" ;
      A3733AlbTar = "" ;
      A5623BarTroObs = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ptroz9999__default(),
         new Object[] {
             new Object[] {
            P04S72_A396EmprCod, P04S72_A129BarCod, P04S72_A132BarCodReo, P04S72_A130BarCodPar, P04S72_A200BarPieCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte W132BarCodReo ;
   private byte A3863BarTroFinP ;
   private byte A3864BarTroEst ;
   private byte A4990BarTroCal ;
   private byte A5622BarTroJau ;
   private short A3858BarTroCod ;
   private short A3861BarTroAnc ;
   private short A4992BarTroUltD ;
   private short Gx_err ;
   private int A129BarCod ;
   private int W129BarCod ;
   private int GX_INS531 ;
   private int A4991BarTroOpeC ;
   private java.math.BigDecimal A3860BarTroMet ;
   private java.math.BigDecimal A6556BarTroKil ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A200BarPieCod ;
   private String scmdbuf ;
   private String W396EmprCod ;
   private String W130BarCodPar ;
   private String W200BarPieCod ;
   private String A3862BarTroIden ;
   private String A3733AlbTar ;
   private String Gx_emsg ;
   private java.util.Date A3859BarTroFec ;
   private boolean n3859BarTroFec ;
   private boolean n3860BarTroMet ;
   private boolean n6556BarTroKil ;
   private boolean n3861BarTroAnc ;
   private boolean n3862BarTroIden ;
   private boolean n3733AlbTar ;
   private boolean n3863BarTroFinP ;
   private boolean n3864BarTroEst ;
   private boolean n4990BarTroCal ;
   private boolean n4991BarTroOpeC ;
   private boolean n4992BarTroUltD ;
   private boolean n5622BarTroJau ;
   private boolean n5623BarTroObs ;
   private String A5623BarTroObs ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P04S72_A396EmprCod ;
   private int[] P04S72_A129BarCod ;
   private byte[] P04S72_A132BarCodReo ;
   private String[] P04S72_A130BarCodPar ;
   private String[] P04S72_A200BarPieCod ;
}

final  class ptroz9999__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04S72", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04S73", "INSERT INTO TXPBARTRO(EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarTroCod, BarTroFec, BarTroMet, BarTroAnc, BarTroIden, AlbTar, BarTroFinP, BarTroEst, BarTroCal, BarTroOpeC, BarTroUltD, BarTroJau, BarTroObs, BarTroKil, BarTroCarr, BarTroOb, BarTroHor) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARTRO")
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DATE );
               }
               else
               {
                  stmt.setDate(7, (java.util.Date)parms[7]);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[11]).shortValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[13], 15);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[15], 2);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(12, ((Number) parms[17]).byteValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(13, ((Number) parms[19]).byteValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(14, ((Number) parms[21]).byteValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(15, ((Number) parms[23]).intValue());
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[25]).shortValue());
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(17, ((Number) parms[27]).byteValue());
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(18, (String)parms[29]);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(19, (java.math.BigDecimal)parms[31], 2);
               }
               return;
      }
   }

}

