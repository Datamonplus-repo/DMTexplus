package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pobspdo extends GXProcedure
{
   public pobspdo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pobspdo.class ), "" );
   }

   public pobspdo( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      pobspdo.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      pobspdo.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pobspdo.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pobspdo.this.A966PartCod = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Aud_UltL = 0 ;
      /* Using cursor P03IV2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A966PartCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A8880Pdo_UltL = P03IV2_A8880Pdo_UltL[0] ;
         n8880Pdo_UltL = P03IV2_n8880Pdo_UltL[0] ;
         /* Using cursor P03IV3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A966PartCod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A8881Pdo_Lin = P03IV3_A8881Pdo_Lin[0] ;
            AV8Aud_UltL = A8881Pdo_Lin ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         A8880Pdo_UltL = AV8Aud_UltL ;
         n8880Pdo_UltL = false ;
         /* Using cursor P03IV4 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n8880Pdo_UltL), Integer.valueOf(A8880Pdo_UltL), A396EmprCod, A966PartCod, Integer.valueOf(A252CliCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPARTI");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pobspdo.this.A396EmprCod;
      this.aP1[0] = pobspdo.this.A252CliCod;
      this.aP2[0] = pobspdo.this.A966PartCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pobspdo");
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
      P03IV2_A396EmprCod = new String[] {""} ;
      P03IV2_A966PartCod = new String[] {""} ;
      P03IV2_A252CliCod = new int[1] ;
      P03IV2_A8880Pdo_UltL = new int[1] ;
      P03IV2_n8880Pdo_UltL = new boolean[] {false} ;
      P03IV3_A396EmprCod = new String[] {""} ;
      P03IV3_A966PartCod = new String[] {""} ;
      P03IV3_A252CliCod = new int[1] ;
      P03IV3_A8881Pdo_Lin = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pobspdo__default(),
         new Object[] {
             new Object[] {
            P03IV2_A396EmprCod, P03IV2_A966PartCod, P03IV2_A252CliCod, P03IV2_A8880Pdo_UltL, P03IV2_n8880Pdo_UltL
            }
            , new Object[] {
            P03IV3_A396EmprCod, P03IV3_A966PartCod, P03IV3_A252CliCod, P03IV3_A8881Pdo_Lin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A252CliCod ;
   private int AV8Aud_UltL ;
   private int A8880Pdo_UltL ;
   private int A8881Pdo_Lin ;
   private String A396EmprCod ;
   private String A966PartCod ;
   private String scmdbuf ;
   private boolean n8880Pdo_UltL ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P03IV2_A396EmprCod ;
   private String[] P03IV2_A966PartCod ;
   private int[] P03IV2_A252CliCod ;
   private int[] P03IV2_A8880Pdo_UltL ;
   private boolean[] P03IV2_n8880Pdo_UltL ;
   private String[] P03IV3_A396EmprCod ;
   private String[] P03IV3_A966PartCod ;
   private int[] P03IV3_A252CliCod ;
   private int[] P03IV3_A8881Pdo_Lin ;
}

final  class pobspdo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03IV2", "SELECT EmprCod, PartCod, CliCod, Pdo_UltL FROM TXPCPARTI WHERE EmprCod = ? and CliCod = ? and PartCod = ? ORDER BY EmprCod, CliCod, PartCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03IV3", "SELECT EmprCod, PartCod, CliCod, Pdo_Lin FROM TXPOBSPDO WHERE EmprCod = ? and CliCod = ? and PartCod = ? ORDER BY EmprCod, CliCod, PartCod, Pdo_Lin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03IV4", "UPDATE TXPCPARTI SET Pdo_UltL=?  WHERE EmprCod = ? AND PartCod = ? AND CliCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCPARTI")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
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
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 16);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               return;
      }
   }

}

