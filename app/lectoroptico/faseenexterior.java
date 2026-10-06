package app.lectoroptico ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class faseenexterior extends GXProcedure
{
   public faseenexterior( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( faseenexterior.class ), "" );
   }

   public faseenexterior( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String aP0 ,
                            int aP1 ,
                            byte aP2 ,
                            String aP3 ,
                            String aP4 )
   {
      faseenexterior.this.aP5 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        String aP4 ,
                        short[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             String aP4 ,
                             short[] aP5 )
   {
      faseenexterior.this.A396EmprCod = aP0;
      faseenexterior.this.A129BarCod = aP1;
      faseenexterior.this.A132BarCodReo = aP2;
      faseenexterior.this.A130BarCodPar = aP3;
      faseenexterior.this.AV8fascod = aP4;
      faseenexterior.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9Lexmvh = (short)(0) ;
      /* Using cursor P0A392 */
      pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2265BarExt = P0A392_A2265BarExt[0] ;
         n2265BarExt = P0A392_n2265BarExt[0] ;
         AV10BarExt = A2265BarExt ;
         /* Using cursor P0A393 */
         pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, AV8fascod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A2689ExHdrFas = P0A393_A2689ExHdrFas[0] ;
            A2248ManCod = P0A393_A2248ManCod[0] ;
            A2692ExHdrLin = P0A393_A2692ExHdrLin[0] ;
            AV9Lexmvh = AV10BarExt ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP5[0] = faseenexterior.this.AV9Lexmvh;
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
      P0A392_A396EmprCod = new String[] {""} ;
      P0A392_A129BarCod = new int[1] ;
      P0A392_n129BarCod = new boolean[] {false} ;
      P0A392_A132BarCodReo = new byte[1] ;
      P0A392_n132BarCodReo = new boolean[] {false} ;
      P0A392_A130BarCodPar = new String[] {""} ;
      P0A392_n130BarCodPar = new boolean[] {false} ;
      P0A392_A2265BarExt = new byte[1] ;
      P0A392_n2265BarExt = new boolean[] {false} ;
      P0A393_A396EmprCod = new String[] {""} ;
      P0A393_A129BarCod = new int[1] ;
      P0A393_n129BarCod = new boolean[] {false} ;
      P0A393_A132BarCodReo = new byte[1] ;
      P0A393_n132BarCodReo = new boolean[] {false} ;
      P0A393_A130BarCodPar = new String[] {""} ;
      P0A393_n130BarCodPar = new boolean[] {false} ;
      P0A393_A2689ExHdrFas = new String[] {""} ;
      P0A393_A2248ManCod = new short[1] ;
      P0A393_A2692ExHdrLin = new int[1] ;
      A2689ExHdrFas = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.lectoroptico.faseenexterior__default(),
         new Object[] {
             new Object[] {
            P0A392_A396EmprCod, P0A392_A129BarCod, P0A392_A132BarCodReo, P0A392_A130BarCodPar, P0A392_A2265BarExt, P0A392_n2265BarExt
            }
            , new Object[] {
            P0A393_A396EmprCod, P0A393_A129BarCod, P0A393_n129BarCod, P0A393_A132BarCodReo, P0A393_n132BarCodReo, P0A393_A130BarCodPar, P0A393_n130BarCodPar, P0A393_A2689ExHdrFas, P0A393_A2248ManCod, P0A393_A2692ExHdrLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A2265BarExt ;
   private byte AV10BarExt ;
   private short AV9Lexmvh ;
   private short A2248ManCod ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A2692ExHdrLin ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV8fascod ;
   private String scmdbuf ;
   private String A2689ExHdrFas ;
   private boolean n129BarCod ;
   private boolean n132BarCodReo ;
   private boolean n130BarCodPar ;
   private boolean n2265BarExt ;
   private short[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A392_A396EmprCod ;
   private int[] P0A392_A129BarCod ;
   private boolean[] P0A392_n129BarCod ;
   private byte[] P0A392_A132BarCodReo ;
   private boolean[] P0A392_n132BarCodReo ;
   private String[] P0A392_A130BarCodPar ;
   private boolean[] P0A392_n130BarCodPar ;
   private byte[] P0A392_A2265BarExt ;
   private boolean[] P0A392_n2265BarExt ;
   private String[] P0A393_A396EmprCod ;
   private int[] P0A393_A129BarCod ;
   private boolean[] P0A393_n129BarCod ;
   private byte[] P0A393_A132BarCodReo ;
   private boolean[] P0A393_n132BarCodReo ;
   private String[] P0A393_A130BarCodPar ;
   private boolean[] P0A393_n130BarCodPar ;
   private String[] P0A393_A2689ExHdrFas ;
   private short[] P0A393_A2248ManCod ;
   private int[] P0A393_A2692ExHdrLin ;
}

final  class faseenexterior__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A392", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarExt FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0A393", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ExHdrFas, ManCod, ExHdrLin FROM TXPLEXMVH WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ExHdrFas = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ExHdrFas ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 8);
               ((short[]) buf[8])[0] = rslt.getShort(6);
               ((int[]) buf[9])[0] = rslt.getInt(7);
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
               return;
            case 1 :
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

