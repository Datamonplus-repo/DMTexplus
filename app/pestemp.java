package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pestemp extends GXProcedure
{
   public pestemp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pestemp.class ), "" );
   }

   public pestemp( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      pestemp.this.aP1 = new int[] {0};
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
      pestemp.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pestemp.this.A44AlbRecCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P036M2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A60AlbRUniUti = P036M2_A60AlbRUniUti[0] ;
         A58AlbRUniEnt = P036M2_A58AlbRUniEnt[0] ;
         A54AlbRPieUti = P036M2_A54AlbRPieUti[0] ;
         A52AlbRPieEnt = P036M2_A52AlbRPieEnt[0] ;
         A47AlbREst = P036M2_A47AlbREst[0] ;
         if ( ( A52AlbRPieEnt == A54AlbRPieUti ) && ( DecimalUtil.compareTo(A58AlbRUniEnt, A60AlbRUniUti) == 0 ) )
         {
            A47AlbREst = (byte)(1) ;
         }
         else
         {
            A47AlbREst = (byte)(0) ;
         }
         /* Using cursor P036M3 */
         pr_default.execute(1, new Object[] {Byte.valueOf(A47AlbREst), A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pestemp.this.A396EmprCod;
      this.aP1[0] = pestemp.this.A44AlbRecCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pestemp");
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
      P036M2_A396EmprCod = new String[] {""} ;
      P036M2_A44AlbRecCod = new int[1] ;
      P036M2_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P036M2_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P036M2_A54AlbRPieUti = new int[1] ;
      P036M2_A52AlbRPieEnt = new int[1] ;
      P036M2_A47AlbREst = new byte[1] ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pestemp__default(),
         new Object[] {
             new Object[] {
            P036M2_A396EmprCod, P036M2_A44AlbRecCod, P036M2_A60AlbRUniUti, P036M2_A58AlbRUniEnt, P036M2_A54AlbRPieUti, P036M2_A52AlbRPieEnt, P036M2_A47AlbREst
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A47AlbREst ;
   private short Gx_err ;
   private int A44AlbRecCod ;
   private int A54AlbRPieUti ;
   private int A52AlbRPieEnt ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P036M2_A396EmprCod ;
   private int[] P036M2_A44AlbRecCod ;
   private java.math.BigDecimal[] P036M2_A60AlbRUniUti ;
   private java.math.BigDecimal[] P036M2_A58AlbRUniEnt ;
   private int[] P036M2_A54AlbRPieUti ;
   private int[] P036M2_A52AlbRPieEnt ;
   private byte[] P036M2_A47AlbREst ;
}

final  class pestemp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P036M2", "SELECT EmprCod, AlbRecCod, AlbRUniUti, AlbRUniEnt, AlbRPieUti, AlbRPieEnt, AlbREst FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P036M3", "UPDATE TXPALBREC SET AlbREst=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
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
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

