package app.trabajosexternos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class trabajoexterno_fechadocumentoanterior extends GXProcedure
{
   public trabajoexterno_fechadocumentoanterior( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( trabajoexterno_fechadocumentoanterior.class ), "" );
   }

   public trabajoexterno_fechadocumentoanterior( int remoteHandle ,
                                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String aP0 ,
                                     int aP1 )
   {
      trabajoexterno_fechadocumentoanterior.this.aP2 = new java.util.Date[] {GXutil.nullDate()};
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
      trabajoexterno_fechadocumentoanterior.this.AV11EmprCod = aP0;
      trabajoexterno_fechadocumentoanterior.this.AV8SalExtAlb = aP1;
      trabajoexterno_fechadocumentoanterior.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( (0==AV8SalExtAlb) )
      {
         GXv_char1[0] = AV11EmprCod ;
         GXv_char2[0] = httpContext.getMessage( "EXTHDR", "") ;
         GXv_int3[0] = AV10SalExtAlblast ;
         new app.pvalcon(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_int3) ;
         trabajoexterno_fechadocumentoanterior.this.AV11EmprCod = GXv_char1[0] ;
         trabajoexterno_fechadocumentoanterior.this.AV10SalExtAlblast = GXv_int3[0] ;
         AV8SalExtAlb = (int)(AV10SalExtAlblast+1) ;
      }
      AV9SalExtFec_Anterior = GXutil.nullDate() ;
      /* Using cursor P0AJV2 */
      pr_default.execute(0, new Object[] {AV11EmprCod, Integer.valueOf(AV8SalExtAlb)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P0AJV2_A396EmprCod[0] ;
         A2253SalExtAlb = P0AJV2_A2253SalExtAlb[0] ;
         A2256SalExtFec = P0AJV2_A2256SalExtFec[0] ;
         AV9SalExtFec_Anterior = A2256SalExtFec ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = trabajoexterno_fechadocumentoanterior.this.AV9SalExtFec_Anterior;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9SalExtFec_Anterior = GXutil.nullDate() ;
      GXv_char1 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new int[1] ;
      scmdbuf = "" ;
      P0AJV2_A396EmprCod = new String[] {""} ;
      P0AJV2_A2253SalExtAlb = new int[1] ;
      P0AJV2_A2256SalExtFec = new java.util.Date[] {GXutil.nullDate()} ;
      A396EmprCod = "" ;
      A2256SalExtFec = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trabajosexternos.trabajoexterno_fechadocumentoanterior__default(),
         new Object[] {
             new Object[] {
            P0AJV2_A396EmprCod, P0AJV2_A2253SalExtAlb, P0AJV2_A2256SalExtFec
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV8SalExtAlb ;
   private int AV10SalExtAlblast ;
   private int GXv_int3[] ;
   private int A2253SalExtAlb ;
   private String AV11EmprCod ;
   private String GXv_char1[] ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private java.util.Date AV9SalExtFec_Anterior ;
   private java.util.Date A2256SalExtFec ;
   private java.util.Date[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AJV2_A396EmprCod ;
   private int[] P0AJV2_A2253SalExtAlb ;
   private java.util.Date[] P0AJV2_A2256SalExtFec ;
}

final  class trabajoexterno_fechadocumentoanterior__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AJV2", "SELECT * FROM (SELECT EmprCod, SalExtAlb, SalExtFec FROM TXPCEXTSA WHERE EmprCod = ? and SalExtAlb < ? ORDER BY EmprCod, SalExtAlb DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

