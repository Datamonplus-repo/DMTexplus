package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pctrdim extends GXProcedure
{
   public pctrdim( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pctrdim.class ), "" );
   }

   public pctrdim( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          byte[] aP2 ,
                          String[] aP3 )
   {
      pctrdim.this.aP4 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 )
   {
      pctrdim.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pctrdim.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pctrdim.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pctrdim.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pctrdim.this.AV8FlagTest = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8FlagTest = 0 ;
      /* Using cursor P010E2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1333EstDimCod = P010E2_A1333EstDimCod[0] ;
         AV8FlagTest = A1333EstDimCod ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pctrdim.this.A396EmprCod;
      this.aP1[0] = pctrdim.this.A129BarCod;
      this.aP2[0] = pctrdim.this.A132BarCodReo;
      this.aP3[0] = pctrdim.this.A130BarCodPar;
      this.aP4[0] = pctrdim.this.AV8FlagTest;
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
      P010E2_A396EmprCod = new String[] {""} ;
      P010E2_A129BarCod = new int[1] ;
      P010E2_n129BarCod = new boolean[] {false} ;
      P010E2_A132BarCodReo = new byte[1] ;
      P010E2_n132BarCodReo = new boolean[] {false} ;
      P010E2_A130BarCodPar = new String[] {""} ;
      P010E2_n130BarCodPar = new boolean[] {false} ;
      P010E2_A1333EstDimCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pctrdim__default(),
         new Object[] {
             new Object[] {
            P010E2_A396EmprCod, P010E2_A129BarCod, P010E2_n129BarCod, P010E2_A132BarCodReo, P010E2_n132BarCodReo, P010E2_A130BarCodPar, P010E2_n130BarCodPar, P010E2_A1333EstDimCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV8FlagTest ;
   private int A1333EstDimCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private boolean n129BarCod ;
   private boolean n132BarCodReo ;
   private boolean n130BarCodPar ;
   private int[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P010E2_A396EmprCod ;
   private int[] P010E2_A129BarCod ;
   private boolean[] P010E2_n129BarCod ;
   private byte[] P010E2_A132BarCodReo ;
   private boolean[] P010E2_n132BarCodReo ;
   private String[] P010E2_A130BarCodPar ;
   private boolean[] P010E2_n130BarCodPar ;
   private int[] P010E2_A1333EstDimCod ;
}

final  class pctrdim__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P010E2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, EstDimCod FROM TXPCESDIM WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[7])[0] = rslt.getInt(5);
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
      }
   }

}

