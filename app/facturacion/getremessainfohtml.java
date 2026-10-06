package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class getremessainfohtml extends GXProcedure
{
   public getremessainfohtml( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( getremessainfohtml.class ), "" );
   }

   public getremessainfohtml( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( java.util.UUID aP0 )
   {
      getremessainfohtml.this.aP1 = new String[] {""};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( java.util.UUID aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( java.util.UUID aP0 ,
                             String[] aP1 )
   {
      getremessainfohtml.this.AV21JobId = aP0;
      getremessainfohtml.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P0AU72 */
      pr_default.execute(0, new Object[] {AV21JobId});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14423JobId = P0AU72_A14423JobId[0] ;
         A14478ParKey = P0AU72_A14478ParKey[0] ;
         A14479ParVal = P0AU72_A14479ParVal[0] ;
         n14479ParVal = P0AU72_n14479ParVal[0] ;
         A14480ValTyp = P0AU72_A14480ValTyp[0] ;
         n14480ValTyp = P0AU72_n14480ValTyp[0] ;
         AV14Key = GXutil.trim( A14478ParKey) ;
         AV19Val = GXutil.trim( A14479ParVal) ;
         AV18Typ = GXutil.upper( GXutil.trim( A14480ValTyp)) ;
         if ( GXutil.strcmp(AV14Key, httpContext.getMessage( "FACCODFROM", "")) == 0 )
         {
            AV12FACCODFROM = (int)(GXutil.lval( AV19Val)) ;
         }
         else if ( GXutil.strcmp(AV14Key, httpContext.getMessage( "FACCODTO", "")) == 0 )
         {
            AV13FACCODTO = (short)(GXutil.lval( AV19Val)) ;
         }
         else if ( GXutil.strcmp(AV14Key, httpContext.getMessage( "CLICODFROM", "")) == 0 )
         {
            AV9CLICODFROM = (int)(GXutil.lval( AV19Val)) ;
         }
         else if ( GXutil.strcmp(AV14Key, httpContext.getMessage( "CLICODTO", "")) == 0 )
         {
            AV29CLICODTO = (int)(GXutil.lval( AV19Val)) ;
         }
         else if ( GXutil.strcmp(AV14Key, httpContext.getMessage( "COPIAS2", "")) == 0 )
         {
            AV10COPIAS2 = (short)(GXutil.lval( AV19Val)) ;
         }
         else if ( GXutil.strcmp(AV14Key, httpContext.getMessage( "F_HEADER", "")) == 0 )
         {
            AV11F_HEADER = (short)(GXutil.lval( AV19Val)) ;
         }
         else if ( GXutil.strcmp(AV14Key, httpContext.getMessage( "AGR_FASES", "")) == 0 )
         {
            AV8AGR_FASES = (short)(GXutil.lval( AV19Val)) ;
         }
         else if ( GXutil.strcmp(AV14Key, httpContext.getMessage( "VERSUMLIN", "")) == 0 )
         {
            AV20VERSUMLIN = ((GXutil.strcmp(AV19Val, "")==0) ? httpContext.getMessage( "N", "") : GXutil.upper( AV19Val)) ;
         }
         else if ( GXutil.strcmp(AV14Key, httpContext.getMessage( "MAIL", "")) == 0 )
         {
            AV15MAIL = ((GXutil.strcmp(AV19Val, "")==0) ? httpContext.getMessage( "N", "") : GXutil.upper( AV19Val)) ;
         }
         else if ( GXutil.strcmp(AV14Key, httpContext.getMessage( "MANAUT", "")) == 0 )
         {
            AV16MANAUT = ((GXutil.strcmp(AV19Val, "")==0) ? httpContext.getMessage( "N", "") : GXutil.upper( AV19Val)) ;
         }
         else if ( GXutil.strcmp(AV14Key, httpContext.getMessage( "OPI", "")) == 0 )
         {
            AV17OPI = ((GXutil.strcmp(AV19Val, "")==0) ? httpContext.getMessage( "N", "") : GXutil.upper( AV19Val)) ;
         }
         else if ( GXutil.strcmp(AV14Key, httpContext.getMessage( "LISTPRINTER", "")) == 0 )
         {
            AV22LISTPRINTER = AV19Val ;
         }
         else if ( GXutil.strcmp(AV14Key, httpContext.getMessage( "ALBPROFCHFROM", "")) == 0 )
         {
            AV42FromAlbProfch = AV19Val ;
         }
         else if ( GXutil.strcmp(AV14Key, httpContext.getMessage( "ALBPROFCHTO", "")) == 0 )
         {
            AV43ToAlbProfch = AV19Val ;
         }
         else if ( GXutil.strcmp(AV14Key, "PRIO") == 0 )
         {
            AV40PriCod = AV19Val ;
         }
         else
         {
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV31Html = "" ;
      AV32SepBr = httpContext.getMessage( "<div style='height:10px;'></div>", "") ;
      AV38BadgeOnStyle = httpContext.getMessage( "display:inline-block;padding:2px 8px;border-radius:999px;font-size:12px;line-height:18px;border:1px solid #cfe8d6;background:#eefaf2;color:#1f7a3a;", "") ;
      AV33BadgeInfoStyle = httpContext.getMessage( "display:inline-block;padding:2px 8px;border-radius:999px;font-size:12px;line-height:18px;border:1px solid #d8e6ff;background:#f3f7ff;color:#1f4f99;", "") ;
      AV34LabelStyle = httpContext.getMessage( "color:#5b677a;font-size:12px;font-weight:600;text-transform:uppercase;letter-spacing:.04em;", "") ;
      AV36TextStyle = httpContext.getMessage( "color:#1f2937;font-size:14px;line-height:20px;", "") ;
      AV35BoxStyle = httpContext.getMessage( "border:1px solid #e5e7eb;border-radius:12px;padding:14px 16px;background:#ffffff;font-family:Arial, Helvetica, sans-serif;", "") ;
      AV31Html += httpContext.getMessage( "<div style='", "") + AV35BoxStyle + "'>" ;
      AV31Html += httpContext.getMessage( "<div style='font-size:16px;font-weight:700;color:#111827;margin-bottom:6px;'>", "") ;
      AV31Html += httpContext.getMessage( "Descrição do Job", "") ;
      AV31Html += httpContext.getMessage( "</div>", "") ;
      if ( ! (GXutil.strcmp("", AV42FromAlbProfch)==0) || ! (GXutil.strcmp("", AV43ToAlbProfch)==0) )
      {
         AV31Html += httpContext.getMessage( "<div style='", "") + AV36TextStyle + httpContext.getMessage( ";margin-bottom:10px;'>", "") ;
         AV31Html += httpContext.getMessage( "Emissão de Guias de Remessa no período de <b>", "") + AV42FromAlbProfch + httpContext.getMessage( "</b> a <b>", "") + AV43ToAlbProfch + httpContext.getMessage( "</b>.", "") ;
         AV31Html += httpContext.getMessage( "</div>", "") ;
      }
      else
      {
         AV31Html += httpContext.getMessage( "<div style='", "") + AV36TextStyle + httpContext.getMessage( ";margin-bottom:10px;'>", "") ;
         AV31Html += httpContext.getMessage( "Emissão de Guia Remessa.", "") ;
         AV31Html += httpContext.getMessage( "</div>", "") ;
      }
      AV30Filtros = "" ;
      if ( ( AV12FACCODFROM != 0 ) || ( AV13FACCODTO != 0 ) )
      {
         AV30Filtros += ((GXutil.strcmp(AV30Filtros, "")==0) ? "" : httpContext.getMessage( " &nbsp;•&nbsp; ", "")) ;
         AV30Filtros += httpContext.getMessage( "<b>Guia de Remessa</b>: ", "") + GXutil.trim( GXutil.str( AV12FACCODFROM, 10, 0)) + httpContext.getMessage( " a ", "") + GXutil.trim( GXutil.str( AV13FACCODTO, 10, 0)) ;
      }
      if ( ( AV9CLICODFROM != 0 ) || ( AV29CLICODTO != 0 ) )
      {
         AV30Filtros += ((GXutil.strcmp(AV30Filtros, "")==0) ? "" : httpContext.getMessage( " &nbsp;•&nbsp; ", "")) ;
         AV30Filtros += httpContext.getMessage( "<b>Clientes</b>: ", "") + GXutil.trim( GXutil.str( AV9CLICODFROM, 10, 0)) + httpContext.getMessage( " a ", "") + GXutil.trim( GXutil.str( AV29CLICODTO, 10, 0)) ;
      }
      if ( GXutil.strcmp(AV30Filtros, "") != 0 )
      {
         AV31Html += httpContext.getMessage( "<div style='margin-top:8px;'>", "") ;
         AV31Html += httpContext.getMessage( "<div style='", "") + AV34LabelStyle + httpContext.getMessage( ";margin-bottom:6px;'>Filtros</div>", "") ;
         AV31Html += httpContext.getMessage( "<div style='", "") + AV36TextStyle + "'>" + AV30Filtros + httpContext.getMessage( "</div>", "") ;
         AV31Html += httpContext.getMessage( "</div>", "") ;
      }
      AV26Saida = "" ;
      if ( AV10COPIAS2 != 0 )
      {
         AV26Saida += ((GXutil.strcmp(AV26Saida, "")==0) ? "" : httpContext.getMessage( " &nbsp;•&nbsp; ", "")) ;
         AV26Saida += httpContext.getMessage( "<b>Cópias</b>: ", "") + GXutil.trim( GXutil.str( AV10COPIAS2, 10, 0)) ;
      }
      if ( AV11F_HEADER != 0 )
      {
         AV26Saida += ((GXutil.strcmp(AV26Saida, "")==0) ? "" : httpContext.getMessage( " &nbsp;•&nbsp; ", "")) ;
         AV26Saida += httpContext.getMessage( "<b>Cabeçalho</b>: ", "") + ((AV11F_HEADER==1) ? "Formato Inicial" : "Formato Novo") ;
      }
      if ( ( GXutil.strcmp(AV40PriCod, "0") == 0 ) || ( GXutil.strcmp(AV40PriCod, "1") == 0 ) )
      {
         AV26Saida += ((GXutil.strcmp(AV26Saida, "")==0) ? "" : httpContext.getMessage( " &nbsp;•&nbsp; ", "")) ;
         if ( GXutil.strcmp(AV40PriCod, "0") == 0 )
         {
            AV26Saida += httpContext.getMessage( "<b>Tipo de Guia</b>: Guia Remessa", "") ;
         }
         else if ( GXutil.strcmp(AV40PriCod, "1") == 0 )
         {
            AV26Saida += httpContext.getMessage( "<b>Tipo de Guia</b>: Guia Transporte", "") ;
         }
      }
      if ( GXutil.strcmp(AV26Saida, "") != 0 )
      {
         AV31Html += httpContext.getMessage( "<div style='margin-top:12px;'>", "") ;
         AV31Html += httpContext.getMessage( "<div style='", "") + AV34LabelStyle + httpContext.getMessage( ";margin-bottom:6px;'>Saída</div>", "") ;
         AV31Html += httpContext.getMessage( "<div style='", "") + AV36TextStyle + "'>" + AV26Saida + httpContext.getMessage( "</div>", "") ;
         AV31Html += httpContext.getMessage( "</div>", "") ;
      }
      AV37Badges = "" ;
      if ( GXutil.strcmp(AV20VERSUMLIN, httpContext.getMessage( "S", "")) == 0 )
      {
         AV37Badges += ((GXutil.strcmp(AV37Badges, "")==0) ? "" : " ") ;
         AV37Badges += httpContext.getMessage( "<span style='", "") + AV33BadgeInfoStyle + httpContext.getMessage( "'>Soma de linhas</span>", "") ;
      }
      if ( GXutil.strcmp(AV15MAIL, httpContext.getMessage( "S", "")) == 0 )
      {
         AV37Badges += ((GXutil.strcmp(AV37Badges, "")==0) ? "" : " ") ;
         AV37Badges += httpContext.getMessage( "<span style='", "") + AV38BadgeOnStyle + httpContext.getMessage( "'>E-mail</span>", "") ;
      }
      if ( GXutil.strcmp(AV16MANAUT, httpContext.getMessage( "S", "")) == 0 )
      {
         AV37Badges += ((GXutil.strcmp(AV37Badges, "")==0) ? "" : " ") ;
         AV37Badges += httpContext.getMessage( "<span style='", "") + AV33BadgeInfoStyle + httpContext.getMessage( "'>Manual</span>", "") ;
      }
      if ( GXutil.strcmp(AV17OPI, httpContext.getMessage( "S", "")) == 0 )
      {
         AV37Badges += ((GXutil.strcmp(AV37Badges, "")==0) ? "" : " ") ;
         AV37Badges += httpContext.getMessage( "<span style='", "") + AV38BadgeOnStyle + httpContext.getMessage( "'>Factura en pantalla</span>", "") ;
      }
      if ( GXutil.strcmp(AV37Badges, "") != 0 )
      {
         AV31Html += httpContext.getMessage( "<div style='margin-top:12px;'>", "") ;
         AV31Html += httpContext.getMessage( "<div style='", "") + AV34LabelStyle + httpContext.getMessage( ";margin-bottom:6px;'>Opções ativas</div>", "") ;
         AV31Html += httpContext.getMessage( "<div style='", "") + AV36TextStyle + "'>" + AV37Badges + httpContext.getMessage( "</div>", "") ;
         AV31Html += httpContext.getMessage( "</div>", "") ;
      }
      if ( GXutil.strcmp(GXutil.trim( AV22LISTPRINTER), "") != 0 )
      {
         AV31Html += httpContext.getMessage( "<div style='margin-top:12px;'>", "") ;
         AV31Html += httpContext.getMessage( "<div style='", "") + AV34LabelStyle + httpContext.getMessage( ";margin-bottom:6px;'>Impressão</div>", "") ;
         AV31Html += httpContext.getMessage( "<div style='", "") + AV36TextStyle + httpContext.getMessage( "'><b>Impressora</b>: ", "") + GXutil.trim( AV22LISTPRINTER) + httpContext.getMessage( "</div>", "") ;
         AV31Html += httpContext.getMessage( "</div>", "") ;
      }
      AV31Html += httpContext.getMessage( "</div>", "") ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = getremessainfohtml.this.AV31Html;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV31Html = "" ;
      scmdbuf = "" ;
      P0AU72_A14423JobId = new java.util.UUID[] {java.util.UUID.fromString("00000000-0000-0000-0000-000000000000")} ;
      P0AU72_A14478ParKey = new String[] {""} ;
      P0AU72_A14479ParVal = new String[] {""} ;
      P0AU72_n14479ParVal = new boolean[] {false} ;
      P0AU72_A14480ValTyp = new String[] {""} ;
      P0AU72_n14480ValTyp = new boolean[] {false} ;
      A14423JobId = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      A14478ParKey = "" ;
      A14479ParVal = "" ;
      A14480ValTyp = "" ;
      AV14Key = "" ;
      AV19Val = "" ;
      AV18Typ = "" ;
      AV20VERSUMLIN = "" ;
      AV15MAIL = "" ;
      AV16MANAUT = "" ;
      AV17OPI = "" ;
      AV22LISTPRINTER = "" ;
      AV42FromAlbProfch = "" ;
      AV43ToAlbProfch = "" ;
      AV40PriCod = "" ;
      AV32SepBr = "" ;
      AV38BadgeOnStyle = "" ;
      AV33BadgeInfoStyle = "" ;
      AV34LabelStyle = "" ;
      AV36TextStyle = "" ;
      AV35BoxStyle = "" ;
      AV30Filtros = "" ;
      AV26Saida = "" ;
      AV37Badges = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.getremessainfohtml__default(),
         new Object[] {
             new Object[] {
            P0AU72_A14423JobId, P0AU72_A14478ParKey, P0AU72_A14479ParVal, P0AU72_n14479ParVal, P0AU72_A14480ValTyp, P0AU72_n14480ValTyp
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV13FACCODTO ;
   private short AV10COPIAS2 ;
   private short AV11F_HEADER ;
   private short AV8AGR_FASES ;
   private short Gx_err ;
   private int AV12FACCODFROM ;
   private int AV9CLICODFROM ;
   private int AV29CLICODTO ;
   private String scmdbuf ;
   private String AV40PriCod ;
   private boolean n14479ParVal ;
   private boolean n14480ValTyp ;
   private String AV31Html ;
   private String AV38BadgeOnStyle ;
   private String AV26Saida ;
   private String AV37Badges ;
   private String A14478ParKey ;
   private String A14479ParVal ;
   private String A14480ValTyp ;
   private String AV14Key ;
   private String AV19Val ;
   private String AV18Typ ;
   private String AV20VERSUMLIN ;
   private String AV15MAIL ;
   private String AV16MANAUT ;
   private String AV17OPI ;
   private String AV22LISTPRINTER ;
   private String AV42FromAlbProfch ;
   private String AV43ToAlbProfch ;
   private String AV32SepBr ;
   private String AV33BadgeInfoStyle ;
   private String AV34LabelStyle ;
   private String AV36TextStyle ;
   private String AV35BoxStyle ;
   private String AV30Filtros ;
   private java.util.UUID AV21JobId ;
   private java.util.UUID A14423JobId ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private java.util.UUID[] P0AU72_A14423JobId ;
   private String[] P0AU72_A14478ParKey ;
   private String[] P0AU72_A14479ParVal ;
   private boolean[] P0AU72_n14479ParVal ;
   private String[] P0AU72_A14480ValTyp ;
   private boolean[] P0AU72_n14480ValTyp ;
}

final  class getremessainfohtml__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AU72", "SELECT JobId, ParKey, ParVal, ValTyp FROM TXPJOBPAR WHERE JobId = ? ORDER BY JobId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.UUID[]) buf[0])[0] = rslt.getGUID(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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
               stmt.setGUID(1, (java.util.UUID)parms[0]);
               return;
      }
   }

}

