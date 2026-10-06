package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnrccau extends GXProcedure
{
   public pnrccau( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnrccau.class ), "" );
   }

   public pnrccau( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             short[] aP1 )
   {
      pnrccau.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 ,
                             String[] aP2 )
   {
      pnrccau.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pnrccau.this.A5085CodCausa = aP1[0];
      this.aP1 = aP1;
      pnrccau.this.AV17DSCCAUSA = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV17DSCCAUSA = httpContext.getMessage( "Inexistente", "") ;
      /* Using cursor P021L2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A5085CodCausa)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5086DscCausa = P021L2_A5086DscCausa[0] ;
         n5086DscCausa = P021L2_n5086DscCausa[0] ;
         AV17DSCCAUSA = A5086DscCausa ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnrccau.this.A396EmprCod;
      this.aP1[0] = pnrccau.this.A5085CodCausa;
      this.aP2[0] = pnrccau.this.AV17DSCCAUSA;
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
      P021L2_A396EmprCod = new String[] {""} ;
      P021L2_A5085CodCausa = new short[1] ;
      P021L2_A5086DscCausa = new String[] {""} ;
      P021L2_n5086DscCausa = new boolean[] {false} ;
      A5086DscCausa = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnrccau__default(),
         new Object[] {
             new Object[] {
            P021L2_A396EmprCod, P021L2_A5085CodCausa, P021L2_A5086DscCausa, P021L2_n5086DscCausa
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A5085CodCausa ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String AV17DSCCAUSA ;
   private String scmdbuf ;
   private String A5086DscCausa ;
   private boolean n5086DscCausa ;
   private String[] aP2 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P021L2_A396EmprCod ;
   private short[] P021L2_A5085CodCausa ;
   private String[] P021L2_A5086DscCausa ;
   private boolean[] P021L2_n5086DscCausa ;
}

final  class pnrccau__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P021L2", "SELECT EmprCod, CodCausa, DscCausa FROM TXPTIPCAU WHERE EmprCod = ? and CodCausa = ? ORDER BY EmprCod, CodCausa ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

