package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class fasetrabajoexterior extends GXProcedure
{
   public fasetrabajoexterior( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( fasetrabajoexterior.class ), "" );
   }

   public fasetrabajoexterior( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String aP0 ,
                            int aP1 ,
                            byte aP2 ,
                            String aP3 ,
                            String aP4 ,
                            java.util.Date[] aP5 ,
                            java.util.Date[] aP6 )
   {
      fasetrabajoexterior.this.aP7 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        String aP4 ,
                        java.util.Date[] aP5 ,
                        java.util.Date[] aP6 ,
                        short[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             String aP4 ,
                             java.util.Date[] aP5 ,
                             java.util.Date[] aP6 ,
                             short[] aP7 )
   {
      fasetrabajoexterior.this.A396EmprCod = aP0;
      fasetrabajoexterior.this.A129BarCod = aP1;
      fasetrabajoexterior.this.A132BarCodReo = aP2;
      fasetrabajoexterior.this.A130BarCodPar = aP3;
      fasetrabajoexterior.this.AV9FasCod = aP4;
      fasetrabajoexterior.this.aP5 = aP5;
      fasetrabajoexterior.this.aP6 = aP6;
      fasetrabajoexterior.this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Lexmvh = (short)(0) ;
      AV10ExHdrFeE = GXutil.nullDate() ;
      AV11ExHdrFeR = GXutil.nullDate() ;
      /* Using cursor P0A622 */
      pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, AV9FasCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2689ExHdrFas = P0A622_A2689ExHdrFas[0] ;
         A2697ExHdrFeE = P0A622_A2697ExHdrFeE[0] ;
         n2697ExHdrFeE = P0A622_n2697ExHdrFeE[0] ;
         A2700ExHdrFeR = P0A622_A2700ExHdrFeR[0] ;
         n2700ExHdrFeR = P0A622_n2700ExHdrFeR[0] ;
         A2248ManCod = P0A622_A2248ManCod[0] ;
         A2692ExHdrLin = P0A622_A2692ExHdrLin[0] ;
         AV10ExHdrFeE = A2697ExHdrFeE ;
         AV11ExHdrFeR = A2700ExHdrFeR ;
         AV8Lexmvh = (short)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP5[0] = fasetrabajoexterior.this.AV10ExHdrFeE;
      this.aP6[0] = fasetrabajoexterior.this.AV11ExHdrFeR;
      this.aP7[0] = fasetrabajoexterior.this.AV8Lexmvh;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10ExHdrFeE = GXutil.nullDate() ;
      AV11ExHdrFeR = GXutil.nullDate() ;
      scmdbuf = "" ;
      P0A622_A396EmprCod = new String[] {""} ;
      P0A622_A129BarCod = new int[1] ;
      P0A622_n129BarCod = new boolean[] {false} ;
      P0A622_A132BarCodReo = new byte[1] ;
      P0A622_n132BarCodReo = new boolean[] {false} ;
      P0A622_A130BarCodPar = new String[] {""} ;
      P0A622_n130BarCodPar = new boolean[] {false} ;
      P0A622_A2689ExHdrFas = new String[] {""} ;
      P0A622_A2697ExHdrFeE = new java.util.Date[] {GXutil.nullDate()} ;
      P0A622_n2697ExHdrFeE = new boolean[] {false} ;
      P0A622_A2700ExHdrFeR = new java.util.Date[] {GXutil.nullDate()} ;
      P0A622_n2700ExHdrFeR = new boolean[] {false} ;
      P0A622_A2248ManCod = new short[1] ;
      P0A622_A2692ExHdrLin = new int[1] ;
      A2689ExHdrFas = "" ;
      A2697ExHdrFeE = GXutil.nullDate() ;
      A2700ExHdrFeR = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.fasetrabajoexterior__default(),
         new Object[] {
             new Object[] {
            P0A622_A396EmprCod, P0A622_A129BarCod, P0A622_n129BarCod, P0A622_A132BarCodReo, P0A622_n132BarCodReo, P0A622_A130BarCodPar, P0A622_n130BarCodPar, P0A622_A2689ExHdrFas, P0A622_A2697ExHdrFeE, P0A622_n2697ExHdrFeE,
            P0A622_A2700ExHdrFeR, P0A622_n2700ExHdrFeR, P0A622_A2248ManCod, P0A622_A2692ExHdrLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short AV8Lexmvh ;
   private short A2248ManCod ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A2692ExHdrLin ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV9FasCod ;
   private String scmdbuf ;
   private String A2689ExHdrFas ;
   private java.util.Date AV10ExHdrFeE ;
   private java.util.Date AV11ExHdrFeR ;
   private java.util.Date A2697ExHdrFeE ;
   private java.util.Date A2700ExHdrFeR ;
   private boolean n129BarCod ;
   private boolean n132BarCodReo ;
   private boolean n130BarCodPar ;
   private boolean n2697ExHdrFeE ;
   private boolean n2700ExHdrFeR ;
   private short[] aP7 ;
   private java.util.Date[] aP5 ;
   private java.util.Date[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A622_A396EmprCod ;
   private int[] P0A622_A129BarCod ;
   private boolean[] P0A622_n129BarCod ;
   private byte[] P0A622_A132BarCodReo ;
   private boolean[] P0A622_n132BarCodReo ;
   private String[] P0A622_A130BarCodPar ;
   private boolean[] P0A622_n130BarCodPar ;
   private String[] P0A622_A2689ExHdrFas ;
   private java.util.Date[] P0A622_A2697ExHdrFeE ;
   private boolean[] P0A622_n2697ExHdrFeE ;
   private java.util.Date[] P0A622_A2700ExHdrFeR ;
   private boolean[] P0A622_n2700ExHdrFeR ;
   private short[] P0A622_A2248ManCod ;
   private int[] P0A622_A2692ExHdrLin ;
}

final  class fasetrabajoexterior__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A622", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ExHdrFas, ExHdrFeE, ExHdrFeR, ManCod, ExHdrLin FROM TXPLEXMVH WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ExHdrFas = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ExHdrFas ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(8);
               ((int[]) buf[13])[0] = rslt.getInt(9);
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
               }
               stmt.setString(5, (String)parms[7], 8);
               return;
      }
   }

}

