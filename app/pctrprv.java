package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pctrprv extends GXProcedure
{
   public pctrprv( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pctrprv.class ), "" );
   }

   public pctrprv( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      pctrprv.this.aP2 = new String[] {""};
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
      pctrprv.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pctrprv.this.AV8PrvNum = aP1[0];
      this.aP1 = aP1;
      pctrprv.this.AV9PrvNom = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9PrvNom = httpContext.getMessage( "Inexistente", "") ;
      /* Using cursor P029V2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8PrvNum)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A795PrvNum = P029V2_A795PrvNum[0] ;
         A794PrvNom = P029V2_A794PrvNom[0] ;
         n794PrvNom = P029V2_n794PrvNom[0] ;
         AV9PrvNom = A794PrvNom ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pctrprv.this.A396EmprCod;
      this.aP1[0] = pctrprv.this.AV8PrvNum;
      this.aP2[0] = pctrprv.this.AV9PrvNom;
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
      P029V2_A396EmprCod = new String[] {""} ;
      P029V2_A795PrvNum = new int[1] ;
      P029V2_A794PrvNom = new String[] {""} ;
      P029V2_n794PrvNom = new boolean[] {false} ;
      A794PrvNom = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pctrprv__default(),
         new Object[] {
             new Object[] {
            P029V2_A396EmprCod, P029V2_A795PrvNum, P029V2_A794PrvNom, P029V2_n794PrvNom
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV8PrvNum ;
   private int A795PrvNum ;
   private String A396EmprCod ;
   private String AV9PrvNom ;
   private String scmdbuf ;
   private String A794PrvNom ;
   private boolean n794PrvNom ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P029V2_A396EmprCod ;
   private int[] P029V2_A795PrvNum ;
   private String[] P029V2_A794PrvNom ;
   private boolean[] P029V2_n794PrvNom ;
}

final  class pctrprv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P029V2", "SELECT EmprCod, PrvNum, PrvNom FROM TXPPRVGEN WHERE EmprCod = ? and PrvNum = ? ORDER BY EmprCod, PrvNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
      }
   }

}

