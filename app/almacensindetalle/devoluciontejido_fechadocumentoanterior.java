package app.almacensindetalle ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class devoluciontejido_fechadocumentoanterior extends GXProcedure
{
   public devoluciontejido_fechadocumentoanterior( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( devoluciontejido_fechadocumentoanterior.class ), "" );
   }

   public devoluciontejido_fechadocumentoanterior( int remoteHandle ,
                                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String aP0 ,
                                     int aP1 )
   {
      devoluciontejido_fechadocumentoanterior.this.aP2 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        java.util.Date[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             java.util.Date[] aP2 )
   {
      devoluciontejido_fechadocumentoanterior.this.AV8Emprcod = aP0;
      devoluciontejido_fechadocumentoanterior.this.AV9DevCruId = aP1;
      devoluciontejido_fechadocumentoanterior.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( (0==AV9DevCruId) )
      {
         GXv_char1[0] = AV8Emprcod ;
         GXv_char2[0] = "022400" ;
         GXv_int3[0] = AV11DevCruIdlast ;
         new app.pvalcon(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_int3) ;
         devoluciontejido_fechadocumentoanterior.this.AV8Emprcod = GXv_char1[0] ;
         devoluciontejido_fechadocumentoanterior.this.AV11DevCruIdlast = GXv_int3[0] ;
         AV9DevCruId = (int)(AV11DevCruIdlast+1) ;
      }
      AV10DevCruFec_Anterior = GXutil.nullDate() ;
      /* Using cursor P0AJ62 */
      pr_default.execute(0, new Object[] {AV8Emprcod, Integer.valueOf(AV9DevCruId)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P0AJ62_A396EmprCod[0] ;
         A11669DevCruId = P0AJ62_A11669DevCruId[0] ;
         A11670DevCruFec = P0AJ62_A11670DevCruFec[0] ;
         AV10DevCruFec_Anterior = A11670DevCruFec ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = devoluciontejido_fechadocumentoanterior.this.AV10DevCruFec_Anterior;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10DevCruFec_Anterior = GXutil.nullDate() ;
      GXv_char1 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new int[1] ;
      scmdbuf = "" ;
      P0AJ62_A396EmprCod = new String[] {""} ;
      P0AJ62_A11669DevCruId = new int[1] ;
      P0AJ62_A11670DevCruFec = new java.util.Date[] {GXutil.nullDate()} ;
      A396EmprCod = "" ;
      A11670DevCruFec = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.almacensindetalle.devoluciontejido_fechadocumentoanterior__default(),
         new Object[] {
             new Object[] {
            P0AJ62_A396EmprCod, P0AJ62_A11669DevCruId, P0AJ62_A11670DevCruFec
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV9DevCruId ;
   private int AV11DevCruIdlast ;
   private int GXv_int3[] ;
   private int A11669DevCruId ;
   private String AV8Emprcod ;
   private String GXv_char1[] ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private java.util.Date AV10DevCruFec_Anterior ;
   private java.util.Date A11670DevCruFec ;
   private java.util.Date[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AJ62_A396EmprCod ;
   private int[] P0AJ62_A11669DevCruId ;
   private java.util.Date[] P0AJ62_A11670DevCruFec ;
}

final  class devoluciontejido_fechadocumentoanterior__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AJ62", "SELECT * FROM (SELECT EmprCod, DevCruId, DevCruFec FROM TXPDEVCRU WHERE EmprCod = ? and DevCruId < ? ORDER BY EmprCod, DevCruId DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
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

