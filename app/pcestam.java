package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcestam extends GXProcedure
{
   public pcestam( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcestam.class ), "" );
   }

   public pcestam( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      pcestam.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      pcestam.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcestam.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pcestam.this.A65ArtCod = aP2[0];
      this.aP2 = aP2;
      pcestam.this.A4061EstNomCol = aP3[0];
      this.aP3 = aP3;
      pcestam.this.AV8Ok = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Ok = httpContext.getMessage( "N", "") ;
      /* Using cursor P04SA2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4061EstNomCol});
      while ( (pr_default.getStatus(0) != 101) )
      {
         AV8Ok = httpContext.getMessage( "S", "") ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcestam.this.A396EmprCod;
      this.aP1[0] = pcestam.this.A252CliCod;
      this.aP2[0] = pcestam.this.A65ArtCod;
      this.aP3[0] = pcestam.this.A4061EstNomCol;
      this.aP4[0] = pcestam.this.AV8Ok;
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
      P04SA2_A396EmprCod = new String[] {""} ;
      P04SA2_A252CliCod = new int[1] ;
      P04SA2_A65ArtCod = new String[] {""} ;
      P04SA2_A4061EstNomCol = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcestam__default(),
         new Object[] {
             new Object[] {
            P04SA2_A396EmprCod, P04SA2_A252CliCod, P04SA2_A65ArtCod, P04SA2_A4061EstNomCol
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String A4061EstNomCol ;
   private String AV8Ok ;
   private String scmdbuf ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P04SA2_A396EmprCod ;
   private int[] P04SA2_A252CliCod ;
   private String[] P04SA2_A65ArtCod ;
   private String[] P04SA2_A4061EstNomCol ;
}

final  class pcestam__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04SA2", "SELECT EmprCod, CliCod, ArtCod, EstNomCol FROM TXPCESTAM WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and EstNomCol = ? ORDER BY EmprCod, CliCod, ArtCod, EstNomCol ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
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
               stmt.setString(4, (String)parms[3], 13);
               return;
      }
   }

}

