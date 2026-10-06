package app.documentotransportecomercial ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class documentotransportecomercial_fechadocumentoanterior extends GXProcedure
{
   public documentotransportecomercial_fechadocumentoanterior( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentotransportecomercial_fechadocumentoanterior.class ), "" );
   }

   public documentotransportecomercial_fechadocumentoanterior( int remoteHandle ,
                                                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String aP0 ,
                                     int aP1 ,
                                     String aP2 )
   {
      documentotransportecomercial_fechadocumentoanterior.this.aP3 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        java.util.Date[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             java.util.Date[] aP3 )
   {
      documentotransportecomercial_fechadocumentoanterior.this.AV13EmprCod = aP0;
      documentotransportecomercial_fechadocumentoanterior.this.AV8Albcomcod = aP1;
      documentotransportecomercial_fechadocumentoanterior.this.AV9AlbcomPri = aP2;
      documentotransportecomercial_fechadocumentoanterior.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV11ContCod = ((GXutil.strcmp(AV9AlbcomPri, "1")==0) ? "100011" : "100012") ;
      if ( (0==AV8Albcomcod) )
      {
         GXv_char1[0] = AV13EmprCod ;
         GXv_char2[0] = AV11ContCod ;
         GXv_int3[0] = (int)(DecimalUtil.decToDouble(AV16Albcomcodlast)) ;
         new app.pvalcon(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_int3) ;
         documentotransportecomercial_fechadocumentoanterior.this.AV13EmprCod = GXv_char1[0] ;
         documentotransportecomercial_fechadocumentoanterior.this.AV11ContCod = GXv_char2[0] ;
         documentotransportecomercial_fechadocumentoanterior.this.AV16Albcomcodlast = DecimalUtil.doubleToDec(GXv_int3[0]) ;
         AV8Albcomcod = (int)(DecimalUtil.decToDouble(AV16Albcomcodlast.add(DecimalUtil.doubleToDec(1)))) ;
      }
      AV10Albcomfch_Anterior = GXutil.nullDate() ;
      /* Using cursor P0AK82 */
      pr_default.execute(0, new Object[] {AV13EmprCod, Integer.valueOf(AV8Albcomcod), AV9AlbcomPri});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P0AK82_A396EmprCod[0] ;
         A22AlbComPri = P0AK82_A22AlbComPri[0] ;
         A14AlbComCod = P0AK82_A14AlbComCod[0] ;
         A17AlbComFch = P0AK82_A17AlbComFch[0] ;
         AV10Albcomfch_Anterior = A17AlbComFch ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = documentotransportecomercial_fechadocumentoanterior.this.AV10Albcomfch_Anterior;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10Albcomfch_Anterior = GXutil.nullDate() ;
      AV11ContCod = "" ;
      GXv_char1 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV16Albcomcodlast = DecimalUtil.ZERO ;
      GXv_int3 = new int[1] ;
      scmdbuf = "" ;
      P0AK82_A396EmprCod = new String[] {""} ;
      P0AK82_A22AlbComPri = new String[] {""} ;
      P0AK82_A14AlbComCod = new int[1] ;
      P0AK82_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      A396EmprCod = "" ;
      A22AlbComPri = "" ;
      A17AlbComFch = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransportecomercial.documentotransportecomercial_fechadocumentoanterior__default(),
         new Object[] {
             new Object[] {
            P0AK82_A396EmprCod, P0AK82_A22AlbComPri, P0AK82_A14AlbComCod, P0AK82_A17AlbComFch
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV8Albcomcod ;
   private int GXv_int3[] ;
   private int A14AlbComCod ;
   private java.math.BigDecimal AV16Albcomcodlast ;
   private String AV13EmprCod ;
   private String AV9AlbcomPri ;
   private String AV11ContCod ;
   private String GXv_char1[] ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A22AlbComPri ;
   private java.util.Date AV10Albcomfch_Anterior ;
   private java.util.Date A17AlbComFch ;
   private java.util.Date[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AK82_A396EmprCod ;
   private String[] P0AK82_A22AlbComPri ;
   private int[] P0AK82_A14AlbComCod ;
   private java.util.Date[] P0AK82_A17AlbComFch ;
}

final  class documentotransportecomercial_fechadocumentoanterior__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AK82", "SELECT * FROM (SELECT EmprCod, AlbComPri, AlbComCod, AlbComFch FROM TXPCALCOM WHERE (EmprCod = ? and AlbComCod < ?) AND (AlbComPri = ?) ORDER BY EmprCod, AlbComCod DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
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
               stmt.setString(3, (String)parms[2], 1);
               return;
      }
   }

}

