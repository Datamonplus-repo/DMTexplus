package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pexialmc extends GXProcedure
{
   public pexialmc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pexialmc.class ), "" );
   }

   public pexialmc( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             byte[] aP1 )
   {
      pexialmc.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        byte[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             byte[] aP1 ,
                             String[] aP2 )
   {
      pexialmc.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pexialmc.this.A8908CC_AlmCod = aP1[0];
      this.aP1 = aP1;
      pexialmc.this.AV8CC_AlmDsc = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8CC_AlmDsc = httpContext.getMessage( "Error", "") ;
      /* Using cursor P03JU2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Byte.valueOf(A8908CC_AlmCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A8909CC_AlmDsc = P03JU2_A8909CC_AlmDsc[0] ;
         n8909CC_AlmDsc = P03JU2_n8909CC_AlmDsc[0] ;
         AV8CC_AlmDsc = A8909CC_AlmDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pexialmc.this.A396EmprCod;
      this.aP1[0] = pexialmc.this.A8908CC_AlmCod;
      this.aP2[0] = pexialmc.this.AV8CC_AlmDsc;
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
      P03JU2_A396EmprCod = new String[] {""} ;
      P03JU2_A8908CC_AlmCod = new byte[1] ;
      P03JU2_A8909CC_AlmDsc = new String[] {""} ;
      P03JU2_n8909CC_AlmDsc = new boolean[] {false} ;
      A8909CC_AlmDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pexialmc__default(),
         new Object[] {
             new Object[] {
            P03JU2_A396EmprCod, P03JU2_A8908CC_AlmCod, P03JU2_A8909CC_AlmDsc, P03JU2_n8909CC_AlmDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A8908CC_AlmCod ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String AV8CC_AlmDsc ;
   private String scmdbuf ;
   private String A8909CC_AlmDsc ;
   private boolean n8909CC_AlmDsc ;
   private String[] aP2 ;
   private String[] aP0 ;
   private byte[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P03JU2_A396EmprCod ;
   private byte[] P03JU2_A8908CC_AlmCod ;
   private String[] P03JU2_A8909CC_AlmDsc ;
   private boolean[] P03JU2_n8909CC_AlmDsc ;
}

final  class pexialmc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03JU2", "SELECT EmprCod, CC_AlmCod, CC_AlmDsc FROM TXPALMCCS WHERE EmprCod = ? and CC_AlmCod = ? ORDER BY EmprCod, CC_AlmCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
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
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
      }
   }

}

