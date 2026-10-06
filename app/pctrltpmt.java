package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pctrltpmt extends GXProcedure
{
   public pctrltpmt( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pctrltpmt.class ), "" );
   }

   public pctrltpmt( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String aP1 )
   {
      pctrltpmt.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String[] aP2 )
   {
      pctrltpmt.this.A396EmprCod = aP0;
      pctrltpmt.this.A10887Cod_Idtx = aP1;
      pctrltpmt.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Dsc_idtx = " " ;
      AV11GXLvl2 = (byte)(0) ;
      /* Using cursor P04JN2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A10887Cod_Idtx});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A10888Dsc_Idtx = P04JN2_A10888Dsc_Idtx[0] ;
         n10888Dsc_Idtx = P04JN2_n10888Dsc_Idtx[0] ;
         AV11GXLvl2 = (byte)(1) ;
         AV8Dsc_idtx = A10888Dsc_Idtx ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV11GXLvl2 == 0 )
      {
         AV8Dsc_idtx = httpContext.getMessage( "Error", "") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = pctrltpmt.this.AV8Dsc_idtx;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8Dsc_idtx = "" ;
      scmdbuf = "" ;
      P04JN2_A396EmprCod = new String[] {""} ;
      P04JN2_A10887Cod_Idtx = new String[] {""} ;
      P04JN2_A10888Dsc_Idtx = new String[] {""} ;
      P04JN2_n10888Dsc_Idtx = new boolean[] {false} ;
      A10888Dsc_Idtx = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pctrltpmt__default(),
         new Object[] {
             new Object[] {
            P04JN2_A396EmprCod, P04JN2_A10887Cod_Idtx, P04JN2_A10888Dsc_Idtx, P04JN2_n10888Dsc_Idtx
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11GXLvl2 ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String A10887Cod_Idtx ;
   private String AV8Dsc_idtx ;
   private String scmdbuf ;
   private String A10888Dsc_Idtx ;
   private boolean n10888Dsc_Idtx ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P04JN2_A396EmprCod ;
   private String[] P04JN2_A10887Cod_Idtx ;
   private String[] P04JN2_A10888Dsc_Idtx ;
   private boolean[] P04JN2_n10888Dsc_Idtx ;
}

final  class pctrltpmt__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04JN2", "SELECT EmprCod, Cod_Idtx, Dsc_Idtx FROM TXPINDITE WHERE EmprCod = ? and Cod_Idtx = ? ORDER BY EmprCod, Cod_Idtx ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
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
               stmt.setString(2, (String)parms[1], 4);
               return;
      }
   }

}

