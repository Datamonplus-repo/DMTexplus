package app.ponteway.v1 ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class get_importstatus extends GXProcedure
{
   public get_importstatus( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( get_importstatus.class ), "" );
   }

   public get_importstatus( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             short[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 )
   {
      get_importstatus.this.aP7 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas aP0 ,
                        String[] aP1 ,
                        java.math.BigDecimal[] aP2 ,
                        short[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             short[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 )
   {
      get_importstatus.this.AV10GuiaRemessaLinhaItemDTO = aP0;
      get_importstatus.this.aP1 = aP1;
      get_importstatus.this.aP2 = aP2;
      get_importstatus.this.aP3 = aP3;
      get_importstatus.this.aP4 = aP4;
      get_importstatus.this.aP5 = aP5;
      get_importstatus.this.aP6 = aP6;
      get_importstatus.this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV11ogARecCod = "" ;
      AV25GXLvl3 = (byte)(0) ;
      /* Using cursor P0ASS2 */
      pr_default.execute(0, new Object[] {Long.valueOf(AV10GuiaRemessaLinhaItemDTO.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Linha()), AV10GuiaRemessaLinhaItemDTO.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Emprcod(), Long.valueOf(AV10GuiaRemessaLinhaItemDTO.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codfornecedor())});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14516ogEntrada = P0ASS2_A14516ogEntrada[0] ;
         n14516ogEntrada = P0ASS2_n14516ogEntrada[0] ;
         A14505ogCliCod = P0ASS2_A14505ogCliCod[0] ;
         A14504ogEmprCod = P0ASS2_A14504ogEmprCod[0] ;
         A14503ogLinha = P0ASS2_A14503ogLinha[0] ;
         A14521ogARecCod = P0ASS2_A14521ogARecCod[0] ;
         n14521ogARecCod = P0ASS2_n14521ogARecCod[0] ;
         A14528ogReferen = P0ASS2_A14528ogReferen[0] ;
         n14528ogReferen = P0ASS2_n14528ogReferen[0] ;
         A14510ogUnidad = P0ASS2_A14510ogUnidad[0] ;
         n14510ogUnidad = P0ASS2_n14510ogUnidad[0] ;
         A14509ogQuant = P0ASS2_A14509ogQuant[0] ;
         n14509ogQuant = P0ASS2_n14509ogQuant[0] ;
         A14508ogRolos = P0ASS2_A14508ogRolos[0] ;
         n14508ogRolos = P0ASS2_n14508ogRolos[0] ;
         A14554ogLocaliza = P0ASS2_A14554ogLocaliza[0] ;
         n14554ogLocaliza = P0ASS2_n14554ogLocaliza[0] ;
         A14514ogFio = P0ASS2_A14514ogFio[0] ;
         n14514ogFio = P0ASS2_n14514ogFio[0] ;
         AV25GXLvl3 = (byte)(1) ;
         AV15EmprCod = A14504ogEmprCod ;
         AV11ogARecCod = GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(A14521ogARecCod), "ZZZZZZZ9")) ;
         AV16ogReferen = A14528ogReferen ;
         AV17ogUniDad = A14510ogUnidad ;
         AV18OGQUANT = A14509ogQuant ;
         AV19OGROLOS = A14508ogRolos ;
         AV21OGLOCALIZAC = A14554ogLocaliza ;
         AV22OGFIO = A14514ogFio ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV25GXLvl3 == 0 )
      {
         AV11ogARecCod = "" ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = get_importstatus.this.AV17ogUniDad;
      this.aP2[0] = get_importstatus.this.AV18OGQUANT;
      this.aP3[0] = get_importstatus.this.AV19OGROLOS;
      this.aP4[0] = get_importstatus.this.AV21OGLOCALIZAC;
      this.aP5[0] = get_importstatus.this.AV22OGFIO;
      this.aP6[0] = get_importstatus.this.AV16ogReferen;
      this.aP7[0] = get_importstatus.this.AV11ogARecCod;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV17ogUniDad = "" ;
      AV18OGQUANT = DecimalUtil.ZERO ;
      AV21OGLOCALIZAC = "" ;
      AV22OGFIO = "" ;
      AV16ogReferen = "" ;
      AV11ogARecCod = "" ;
      scmdbuf = "" ;
      P0ASS2_A14516ogEntrada = new String[] {""} ;
      P0ASS2_n14516ogEntrada = new boolean[] {false} ;
      P0ASS2_A14505ogCliCod = new long[1] ;
      P0ASS2_A14504ogEmprCod = new String[] {""} ;
      P0ASS2_A14503ogLinha = new long[1] ;
      P0ASS2_A14521ogARecCod = new int[1] ;
      P0ASS2_n14521ogARecCod = new boolean[] {false} ;
      P0ASS2_A14528ogReferen = new String[] {""} ;
      P0ASS2_n14528ogReferen = new boolean[] {false} ;
      P0ASS2_A14510ogUnidad = new String[] {""} ;
      P0ASS2_n14510ogUnidad = new boolean[] {false} ;
      P0ASS2_A14509ogQuant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ASS2_n14509ogQuant = new boolean[] {false} ;
      P0ASS2_A14508ogRolos = new short[1] ;
      P0ASS2_n14508ogRolos = new boolean[] {false} ;
      P0ASS2_A14554ogLocaliza = new String[] {""} ;
      P0ASS2_n14554ogLocaliza = new boolean[] {false} ;
      P0ASS2_A14514ogFio = new String[] {""} ;
      P0ASS2_n14514ogFio = new boolean[] {false} ;
      A14516ogEntrada = "" ;
      A14504ogEmprCod = "" ;
      A14528ogReferen = "" ;
      A14510ogUnidad = "" ;
      A14509ogQuant = DecimalUtil.ZERO ;
      A14554ogLocaliza = "" ;
      A14514ogFio = "" ;
      AV15EmprCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ponteway.v1.get_importstatus__default(),
         new Object[] {
             new Object[] {
            P0ASS2_A14516ogEntrada, P0ASS2_n14516ogEntrada, P0ASS2_A14505ogCliCod, P0ASS2_A14504ogEmprCod, P0ASS2_A14503ogLinha, P0ASS2_A14521ogARecCod, P0ASS2_n14521ogARecCod, P0ASS2_A14528ogReferen, P0ASS2_n14528ogReferen, P0ASS2_A14510ogUnidad,
            P0ASS2_n14510ogUnidad, P0ASS2_A14509ogQuant, P0ASS2_n14509ogQuant, P0ASS2_A14508ogRolos, P0ASS2_n14508ogRolos, P0ASS2_A14554ogLocaliza, P0ASS2_n14554ogLocaliza, P0ASS2_A14514ogFio, P0ASS2_n14514ogFio
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV25GXLvl3 ;
   private short AV19OGROLOS ;
   private short A14508ogRolos ;
   private short Gx_err ;
   private int A14521ogARecCod ;
   private long A14505ogCliCod ;
   private long A14503ogLinha ;
   private java.math.BigDecimal AV18OGQUANT ;
   private java.math.BigDecimal A14509ogQuant ;
   private String scmdbuf ;
   private String AV15EmprCod ;
   private boolean n14516ogEntrada ;
   private boolean n14521ogARecCod ;
   private boolean n14528ogReferen ;
   private boolean n14510ogUnidad ;
   private boolean n14509ogQuant ;
   private boolean n14508ogRolos ;
   private boolean n14554ogLocaliza ;
   private boolean n14514ogFio ;
   private String AV17ogUniDad ;
   private String AV21OGLOCALIZAC ;
   private String AV22OGFIO ;
   private String AV16ogReferen ;
   private String AV11ogARecCod ;
   private String A14516ogEntrada ;
   private String A14504ogEmprCod ;
   private String A14528ogReferen ;
   private String A14510ogUnidad ;
   private String A14554ogLocaliza ;
   private String A14514ogFio ;
   private String[] aP7 ;
   private String[] aP1 ;
   private java.math.BigDecimal[] aP2 ;
   private short[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P0ASS2_A14516ogEntrada ;
   private boolean[] P0ASS2_n14516ogEntrada ;
   private long[] P0ASS2_A14505ogCliCod ;
   private String[] P0ASS2_A14504ogEmprCod ;
   private long[] P0ASS2_A14503ogLinha ;
   private int[] P0ASS2_A14521ogARecCod ;
   private boolean[] P0ASS2_n14521ogARecCod ;
   private String[] P0ASS2_A14528ogReferen ;
   private boolean[] P0ASS2_n14528ogReferen ;
   private String[] P0ASS2_A14510ogUnidad ;
   private boolean[] P0ASS2_n14510ogUnidad ;
   private java.math.BigDecimal[] P0ASS2_A14509ogQuant ;
   private boolean[] P0ASS2_n14509ogQuant ;
   private short[] P0ASS2_A14508ogRolos ;
   private boolean[] P0ASS2_n14508ogRolos ;
   private String[] P0ASS2_A14554ogLocaliza ;
   private boolean[] P0ASS2_n14554ogLocaliza ;
   private String[] P0ASS2_A14514ogFio ;
   private boolean[] P0ASS2_n14514ogFio ;
   private app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas AV10GuiaRemessaLinhaItemDTO ;
}

final  class get_importstatus__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ASS2", "SELECT ogEntrada, ogCliCod, ogEmprCod, ogLinha, ogARecCod, ogReferen, ogUnidad, ogQuant, ogRolos, ogLocaliza, ogFio FROM TXPOGGUIA WHERE (ogLinha = ? and ogEmprCod = ? and ogCliCod = ?) AND (ogEntrada = 'IMPORTED') ORDER BY ogLinha, ogEmprCod, ogCliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2);
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((long[]) buf[4])[0] = rslt.getLong(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
      }
   }

}

