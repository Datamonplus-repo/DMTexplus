package app.core ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdscgrpfam extends GXProcedure
{
   public pdscgrpfam( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdscgrpfam.class ), "" );
   }

   public pdscgrpfam( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             byte aP1 )
   {
      pdscgrpfam.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        byte aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             byte aP1 ,
                             String[] aP2 )
   {
      pdscgrpfam.this.A396EmprCod = aP0;
      pdscgrpfam.this.A499GrpFamCod = aP1;
      pdscgrpfam.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8GrpFamDsc = " " ;
      AV11GXLvl2 = (byte)(0) ;
      /* Using cursor P05Y42 */
      pr_default.execute(0, new Object[] {A396EmprCod, Byte.valueOf(A499GrpFamCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A500GrpFamDsc = P05Y42_A500GrpFamDsc[0] ;
         n500GrpFamDsc = P05Y42_n500GrpFamDsc[0] ;
         AV11GXLvl2 = (byte)(1) ;
         AV8GrpFamDsc = A500GrpFamDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV11GXLvl2 == 0 )
      {
         AV8GrpFamDsc = ((A499GrpFamCod>0) ? httpContext.getMessage( "ERROR.Codigo Inexistente", "") : " ") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = pdscgrpfam.this.AV8GrpFamDsc;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8GrpFamDsc = "" ;
      scmdbuf = "" ;
      P05Y42_A396EmprCod = new String[] {""} ;
      P05Y42_A499GrpFamCod = new byte[1] ;
      P05Y42_A500GrpFamDsc = new String[] {""} ;
      P05Y42_n500GrpFamDsc = new boolean[] {false} ;
      A500GrpFamDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.core.pdscgrpfam__default(),
         new Object[] {
             new Object[] {
            P05Y42_A396EmprCod, P05Y42_A499GrpFamCod, P05Y42_A500GrpFamDsc, P05Y42_n500GrpFamDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A499GrpFamCod ;
   private byte AV11GXLvl2 ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String AV8GrpFamDsc ;
   private String scmdbuf ;
   private String A500GrpFamDsc ;
   private boolean n500GrpFamDsc ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P05Y42_A396EmprCod ;
   private byte[] P05Y42_A499GrpFamCod ;
   private String[] P05Y42_A500GrpFamDsc ;
   private boolean[] P05Y42_n500GrpFamDsc ;
}

final  class pdscgrpfam__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05Y42", "SELECT EmprCod, GrpFamCod, GrpFamDsc FROM TXPGRUFAM WHERE EmprCod = ? and GrpFamCod = ? ORDER BY EmprCod, GrpFamCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
      }
   }

}

