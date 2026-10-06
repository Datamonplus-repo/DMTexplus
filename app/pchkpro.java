package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pchkpro extends GXProcedure
{
   public pchkpro( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pchkpro.class ), "" );
   }

   public pchkpro( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           String[] aP2 )
   {
      pchkpro.this.aP3 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        byte[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 )
   {
      pchkpro.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pchkpro.this.AV10ProCod = aP1[0];
      this.aP1 = aP1;
      pchkpro.this.AV9ProDsc = aP2[0];
      this.aP2 = aP2;
      pchkpro.this.AV8FlagPro = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8FlagPro = (byte)(0) ;
      /* Using cursor P00ID2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV10ProCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A758ProCod = P00ID2_A758ProCod[0] ;
         A759ProDsc = P00ID2_A759ProDsc[0] ;
         AV9ProDsc = A759ProDsc ;
         AV8FlagPro = (byte)(1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pchkpro.this.A396EmprCod;
      this.aP1[0] = pchkpro.this.AV10ProCod;
      this.aP2[0] = pchkpro.this.AV9ProDsc;
      this.aP3[0] = pchkpro.this.AV8FlagPro;
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
      P00ID2_A396EmprCod = new String[] {""} ;
      P00ID2_A758ProCod = new String[] {""} ;
      P00ID2_A759ProDsc = new String[] {""} ;
      A758ProCod = "" ;
      A759ProDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pchkpro__default(),
         new Object[] {
             new Object[] {
            P00ID2_A396EmprCod, P00ID2_A758ProCod, P00ID2_A759ProDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV8FlagPro ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String AV10ProCod ;
   private String AV9ProDsc ;
   private String scmdbuf ;
   private String A758ProCod ;
   private String A759ProDsc ;
   private byte[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P00ID2_A396EmprCod ;
   private String[] P00ID2_A758ProCod ;
   private String[] P00ID2_A759ProDsc ;
}

final  class pchkpro__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00ID2", "SELECT * FROM (SELECT EmprCod, ProCod, ProDsc FROM TXPPROCES WHERE EmprCod = ? and ProCod >= ? ORDER BY EmprCod, ProCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
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

