package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdigcom extends GXProcedure
{
   public pdigcom( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdigcom.class ), "" );
   }

   public pdigcom( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      pdigcom.this.aP1 = new int[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 )
   {
      pdigcom.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdigcom.this.A361DisCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized DELETE. */
      /* Using cursor P05PU2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISCOM");
      /* End optimized DELETE. */
      AV8DisDGLin = (byte)(1) ;
      /* Using cursor P05PU3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A13084DisDGComb = P05PU3_A13084DisDGComb[0] ;
         A13085DisDGFondo = P05PU3_A13085DisDGFondo[0] ;
         A13088DisDGAnc = P05PU3_A13088DisDGAnc[0] ;
         A13086DisDGMts = P05PU3_A13086DisDGMts[0] ;
         A13087DisDGPzs = P05PU3_A13087DisDGPzs[0] ;
         A13091DisDGObs = P05PU3_A13091DisDGObs[0] ;
         A13082DisDGDibCl = P05PU3_A13082DisDGDibCl[0] ;
         A13083DisDGDibIn = P05PU3_A13083DisDGDibIn[0] ;
         A13081DisDGLin = P05PU3_A13081DisDGLin[0] ;
         W396EmprCod = A396EmprCod ;
         W361DisCod = A361DisCod ;
         /*
            INSERT RECORD ON TABLE TXPDISCOM

         */
         W396EmprCod = A396EmprCod ;
         W361DisCod = A361DisCod ;
         A2524DisComLin = AV8DisDGLin ;
         A1056DisComCod = A13084DisDGComb ;
         A1032FonCod = A13085DisDGFondo ;
         A1057DisComAnh = A13088DisDGAnc ;
         n1057DisComAnh = false ;
         A1058DisComMtr = A13086DisDGMts ;
         n1058DisComMtr = false ;
         A1059DisComPie = (short)(A13087DisDGPzs) ;
         n1059DisComPie = false ;
         A7735DisComObs = A13091DisDGObs ;
         n7735DisComObs = false ;
         A13072DisComDibC = A13082DisDGDibCl ;
         n13072DisComDibC = false ;
         A13073DisComDibI = A13083DisDGDibIn ;
         n13073DisComDibI = false ;
         /* Using cursor P05PU4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Boolean.valueOf(n1057DisComAnh), Short.valueOf(A1057DisComAnh), Boolean.valueOf(n1058DisComMtr), A1058DisComMtr, Boolean.valueOf(n1059DisComPie), Short.valueOf(A1059DisComPie), Boolean.valueOf(n7735DisComObs), A7735DisComObs, Boolean.valueOf(n13072DisComDibC), A13072DisComDibC, Boolean.valueOf(n13073DisComDibI), Integer.valueOf(A13073DisComDibI)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISCOM");
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
         A396EmprCod = W396EmprCod ;
         A361DisCod = W361DisCod ;
         /* End Insert */
         AV8DisDGLin = (byte)(AV8DisDGLin+1) ;
         A396EmprCod = W396EmprCod ;
         A361DisCod = W361DisCod ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      /* Optimized UPDATE. */
      /* Using cursor P05PU5 */
      pr_default.execute(3, new Object[] {Byte.valueOf(AV8DisDGLin), A396EmprCod, Integer.valueOf(A361DisCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdigcom.this.A396EmprCod;
      this.aP1[0] = pdigcom.this.A361DisCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdigcom");
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
      P05PU3_A396EmprCod = new String[] {""} ;
      P05PU3_A361DisCod = new int[1] ;
      P05PU3_A13084DisDGComb = new String[] {""} ;
      P05PU3_A13085DisDGFondo = new String[] {""} ;
      P05PU3_A13088DisDGAnc = new short[1] ;
      P05PU3_A13086DisDGMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05PU3_A13087DisDGPzs = new int[1] ;
      P05PU3_A13091DisDGObs = new String[] {""} ;
      P05PU3_A13082DisDGDibCl = new String[] {""} ;
      P05PU3_A13083DisDGDibIn = new int[1] ;
      P05PU3_A13081DisDGLin = new byte[1] ;
      A13084DisDGComb = "" ;
      A13085DisDGFondo = "" ;
      A13086DisDGMts = DecimalUtil.ZERO ;
      A13091DisDGObs = "" ;
      A13082DisDGDibCl = "" ;
      W396EmprCod = "" ;
      A1056DisComCod = "" ;
      A1032FonCod = "" ;
      A1058DisComMtr = DecimalUtil.ZERO ;
      A7735DisComObs = "" ;
      A13072DisComDibC = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdigcom__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            P05PU3_A396EmprCod, P05PU3_A361DisCod, P05PU3_A13084DisDGComb, P05PU3_A13085DisDGFondo, P05PU3_A13088DisDGAnc, P05PU3_A13086DisDGMts, P05PU3_A13087DisDGPzs, P05PU3_A13091DisDGObs, P05PU3_A13082DisDGDibCl, P05PU3_A13083DisDGDibIn,
            P05PU3_A13081DisDGLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV8DisDGLin ;
   private byte A13081DisDGLin ;
   private byte A2524DisComLin ;
   private short A13088DisDGAnc ;
   private short A1057DisComAnh ;
   private short A1059DisComPie ;
   private short Gx_err ;
   private int A361DisCod ;
   private int A13087DisDGPzs ;
   private int A13083DisDGDibIn ;
   private int W361DisCod ;
   private int GX_INS551 ;
   private int A13073DisComDibI ;
   private java.math.BigDecimal A13086DisDGMts ;
   private java.math.BigDecimal A1058DisComMtr ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A13084DisDGComb ;
   private String A13085DisDGFondo ;
   private String A13091DisDGObs ;
   private String A13082DisDGDibCl ;
   private String W396EmprCod ;
   private String A1056DisComCod ;
   private String A1032FonCod ;
   private String A7735DisComObs ;
   private String A13072DisComDibC ;
   private String Gx_emsg ;
   private boolean n1057DisComAnh ;
   private boolean n1058DisComMtr ;
   private boolean n1059DisComPie ;
   private boolean n7735DisComObs ;
   private boolean n13072DisComDibC ;
   private boolean n13073DisComDibI ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P05PU3_A396EmprCod ;
   private int[] P05PU3_A361DisCod ;
   private String[] P05PU3_A13084DisDGComb ;
   private String[] P05PU3_A13085DisDGFondo ;
   private short[] P05PU3_A13088DisDGAnc ;
   private java.math.BigDecimal[] P05PU3_A13086DisDGMts ;
   private int[] P05PU3_A13087DisDGPzs ;
   private String[] P05PU3_A13091DisDGObs ;
   private String[] P05PU3_A13082DisDGDibCl ;
   private int[] P05PU3_A13083DisDGDibIn ;
   private byte[] P05PU3_A13081DisDGLin ;
}

final  class pdigcom__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P05PU2", "DELETE FROM TXPDISCOM  WHERE EmprCod = ? and DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISCOM")
         ,new ForEachCursor("P05PU3", "SELECT EmprCod, DisCod, DisDGComb, DisDGFondo, DisDGAnc, DisDGMts, DisDGPzs, DisDGObs, DisDGDibCl, DisDGDibIn, DisDGLin FROM TXPDIGCOM WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, DisDGLin, DisDGDibCl, DisDGDibIn, DisDGComb, DisDGFondo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05PU4", "INSERT INTO TXPDISCOM(EmprCod, DisCod, DisComLin, DisComCod, FonCod, DisComAnh, DisComMtr, DisComPie, DisComObs, DisComDibC, DisComDibI) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISCOM")
         ,new UpdateCursor("P05PU5", "UPDATE TXPDISPOS SET DisDGUltli=? - 1  WHERE EmprCod = ? and DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 70);
               ((String[]) buf[8])[0] = rslt.getString(9, 16);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 12);
               stmt.setString(5, (String)parms[4], 12);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[6]).shortValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[8], 2);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[10]).shortValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[12], 70);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[14], 16);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(11, ((Number) parms[16]).intValue());
               }
               return;
            case 3 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

