package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class palbrent extends GXProcedure
{
   public palbrent( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( palbrent.class ), "" );
   }

   public palbrent( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 )
   {
      palbrent.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 )
   {
      palbrent.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      palbrent.this.AV8ALbREnt = aP1[0];
      this.aP1 = aP1;
      palbrent.this.Gx_msg = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gx_msg = " " ;
      /* Using cursor P04Z62 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV8ALbREnt});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A46AlbREnt = P04Z62_A46AlbREnt[0] ;
         A44AlbRecCod = P04Z62_A44AlbRecCod[0] ;
         if ( GXutil.strcmp(Gx_msg, " ") == 0 )
         {
            Gx_msg = httpContext.getMessage( "N Entrada = ", "") + GXutil.trim( AV8ALbREnt) + GXutil.newLine( ) ;
            Gx_msg += httpContext.getMessage( "Existe en las Entradas:", "") + GXutil.newLine( ) ;
         }
         Gx_msg += GXutil.str( A44AlbRecCod, 8, 0) + GXutil.newLine( ) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = palbrent.this.A396EmprCod;
      this.aP1[0] = palbrent.this.AV8ALbREnt;
      this.aP2[0] = palbrent.this.Gx_msg;
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
      P04Z62_A396EmprCod = new String[] {""} ;
      P04Z62_A46AlbREnt = new String[] {""} ;
      P04Z62_A44AlbRecCod = new int[1] ;
      A46AlbREnt = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.palbrent__default(),
         new Object[] {
             new Object[] {
            P04Z62_A396EmprCod, P04Z62_A46AlbREnt, P04Z62_A44AlbRecCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A44AlbRecCod ;
   private String A396EmprCod ;
   private String AV8ALbREnt ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A46AlbREnt ;
   private String[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P04Z62_A396EmprCod ;
   private String[] P04Z62_A46AlbREnt ;
   private int[] P04Z62_A44AlbRecCod ;
}

final  class palbrent__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04Z62", "SELECT EmprCod, AlbREnt, AlbRecCod FROM TXPALBREC WHERE EmprCod = ? and AlbREnt = ? ORDER BY EmprCod, AlbREnt ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
               stmt.setString(2, (String)parms[1], 8);
               return;
      }
   }

}

