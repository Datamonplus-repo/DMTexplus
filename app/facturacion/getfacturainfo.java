package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class getfacturainfo extends GXProcedure
{
   public getfacturainfo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( getfacturainfo.class ), "" );
   }

   public getfacturainfo( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( java.util.UUID aP0 )
   {
      getfacturainfo.this.aP1 = new String[] {""};
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
      getfacturainfo.this.AV24JobId = aP0;
      getfacturainfo.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV26Texto = "" ;
      AV30Sep = "" ;
      AV8FACCODFROM = 0 ;
      AV9FACCODTO = (short)(0) ;
      AV10CLICODFROM = 0 ;
      AV32CLICODTO = 0 ;
      AV11COPIAS2 = (short)(0) ;
      AV12F_HEADER = (short)(0) ;
      AV13AGR_FASES = (short)(0) ;
      AV14VERSUMLIN = httpContext.getMessage( "N", "") ;
      AV15MAIL = httpContext.getMessage( "N", "") ;
      AV16MANAUT = httpContext.getMessage( "N", "") ;
      AV17OPI = httpContext.getMessage( "N", "") ;
      AV25LISTPRINTER = "" ;
      /* Using cursor P0APC2 */
      pr_default.execute(0, new Object[] {AV24JobId});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14423JobId = P0APC2_A14423JobId[0] ;
         A14478ParKey = P0APC2_A14478ParKey[0] ;
         A14479ParVal = P0APC2_A14479ParVal[0] ;
         n14479ParVal = P0APC2_n14479ParVal[0] ;
         A14480ValTyp = P0APC2_A14480ValTyp[0] ;
         n14480ValTyp = P0APC2_n14480ValTyp[0] ;
         AV18Key = GXutil.trim( A14478ParKey) ;
         AV19Val = GXutil.trim( A14479ParVal) ;
         AV20Typ = GXutil.upper( GXutil.trim( A14480ValTyp)) ;
         if ( GXutil.strcmp(AV18Key, httpContext.getMessage( "FACCODFROM", "")) == 0 )
         {
            AV8FACCODFROM = (int)(GXutil.lval( AV19Val)) ;
         }
         else if ( GXutil.strcmp(AV18Key, httpContext.getMessage( "FACCODTO", "")) == 0 )
         {
            AV9FACCODTO = (short)(GXutil.lval( AV19Val)) ;
         }
         else if ( GXutil.strcmp(AV18Key, httpContext.getMessage( "CLICODFROM", "")) == 0 )
         {
            AV10CLICODFROM = (int)(GXutil.lval( AV19Val)) ;
         }
         else if ( GXutil.strcmp(AV18Key, httpContext.getMessage( "CLICODTO", "")) == 0 )
         {
            AV32CLICODTO = (int)(GXutil.lval( AV19Val)) ;
         }
         else if ( GXutil.strcmp(AV18Key, httpContext.getMessage( "COPIAS2", "")) == 0 )
         {
            AV11COPIAS2 = (short)(GXutil.lval( AV19Val)) ;
         }
         else if ( GXutil.strcmp(AV18Key, httpContext.getMessage( "F_HEADER", "")) == 0 )
         {
            AV12F_HEADER = (short)(GXutil.lval( AV19Val)) ;
         }
         else if ( GXutil.strcmp(AV18Key, httpContext.getMessage( "AGR_FASES", "")) == 0 )
         {
            AV13AGR_FASES = (short)(GXutil.lval( AV19Val)) ;
         }
         else if ( GXutil.strcmp(AV18Key, httpContext.getMessage( "VERSUMLIN", "")) == 0 )
         {
            AV14VERSUMLIN = ((GXutil.strcmp(AV19Val, "")==0) ? httpContext.getMessage( "N", "") : GXutil.upper( AV19Val)) ;
         }
         else if ( GXutil.strcmp(AV18Key, httpContext.getMessage( "MAIL", "")) == 0 )
         {
            AV15MAIL = ((GXutil.strcmp(AV19Val, "")==0) ? httpContext.getMessage( "N", "") : GXutil.upper( AV19Val)) ;
         }
         else if ( GXutil.strcmp(AV18Key, httpContext.getMessage( "MANAUT", "")) == 0 )
         {
            AV16MANAUT = ((GXutil.strcmp(AV19Val, "")==0) ? httpContext.getMessage( "N", "") : GXutil.upper( AV19Val)) ;
         }
         else if ( GXutil.strcmp(AV18Key, httpContext.getMessage( "OPI", "")) == 0 )
         {
            AV17OPI = ((GXutil.strcmp(AV19Val, "")==0) ? httpContext.getMessage( "N", "") : GXutil.upper( AV19Val)) ;
         }
         else if ( GXutil.strcmp(AV18Key, httpContext.getMessage( "LISTPRINTER", "")) == 0 )
         {
            AV25LISTPRINTER = AV19Val ;
         }
         else if ( GXutil.strcmp(AV18Key, httpContext.getMessage( "FACFCHFROM", "")) == 0 )
         {
            AV27FACFCHFROM = AV19Val ;
         }
         else if ( GXutil.strcmp(AV18Key, httpContext.getMessage( "FACFCHTO", "")) == 0 )
         {
            AV28FACFCHTO = AV19Val ;
         }
         else
         {
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( ! (GXutil.strcmp("", AV27FACFCHFROM)==0) || ! (GXutil.strcmp("", AV28FACFCHTO)==0) )
      {
         AV26Texto += httpContext.getMessage( "Job de emissão de faturação no período de ", "") + AV27FACFCHFROM + httpContext.getMessage( " a ", "") + AV28FACFCHTO ;
         AV30Sep = ". " ;
      }
      else
      {
         AV26Texto += httpContext.getMessage( "Job de emissão de faturação", "") ;
         AV30Sep = ". " ;
      }
      AV33Filtros = "" ;
      if ( ( AV8FACCODFROM != 0 ) || ( AV9FACCODTO != 0 ) )
      {
         AV33Filtros += ((GXutil.strcmp(AV33Filtros, "")==0) ? "" : "; ") ;
         AV33Filtros += httpContext.getMessage( "faturas de ", "") + GXutil.trim( GXutil.str( AV8FACCODFROM, 10, 0)) + httpContext.getMessage( " a ", "") + GXutil.trim( GXutil.str( AV9FACCODTO, 10, 0)) ;
      }
      if ( ( AV10CLICODFROM != 0 ) || ( AV32CLICODTO != 0 ) )
      {
         AV33Filtros += ((GXutil.strcmp(AV33Filtros, "")==0) ? "" : "; ") ;
         AV33Filtros += httpContext.getMessage( "clientes de ", "") + GXutil.trim( GXutil.str( AV10CLICODFROM, 10, 0)) + httpContext.getMessage( " a ", "") + GXutil.trim( GXutil.str( AV32CLICODTO, 10, 0)) ;
      }
      if ( GXutil.strcmp(AV33Filtros, "") != 0 )
      {
         AV26Texto += AV30Sep + httpContext.getMessage( "Filtros aplicados: ", "") + AV33Filtros ;
         AV30Sep = ". " ;
      }
      AV29Saida = "" ;
      if ( AV11COPIAS2 != 0 )
      {
         AV29Saida += ((GXutil.strcmp(AV29Saida, "")==0) ? "" : ", ") ;
         AV29Saida += GXutil.trim( GXutil.str( AV11COPIAS2, 10, 0)) + httpContext.getMessage( " cópia(s)", "") ;
      }
      if ( AV12F_HEADER != 0 )
      {
         AV29Saida += ((GXutil.strcmp(AV29Saida, "")==0) ? "" : ", ") ;
         AV29Saida += httpContext.getMessage( "cabeçalho ", "") + GXutil.trim( GXutil.str( AV12F_HEADER, 10, 0)) ;
      }
      if ( AV13AGR_FASES != 0 )
      {
         AV29Saida += ((GXutil.strcmp(AV29Saida, "")==0) ? "" : ", ") ;
         AV29Saida += httpContext.getMessage( "agrupamento por fases", "") ;
      }
      if ( GXutil.strcmp(AV29Saida, "") != 0 )
      {
         AV26Texto += AV30Sep + httpContext.getMessage( "Saída com ", "") + AV29Saida ;
         AV30Sep = ". " ;
      }
      AV31Opcoes = "" ;
      if ( GXutil.strcmp(AV14VERSUMLIN, httpContext.getMessage( "S", "")) == 0 )
      {
         AV31Opcoes += ((GXutil.strcmp(AV31Opcoes, "")==0) ? "" : ", ") + httpContext.getMessage( "soma de linhas", "") ;
      }
      if ( GXutil.strcmp(AV15MAIL, httpContext.getMessage( "S", "")) == 0 )
      {
         AV31Opcoes += ((GXutil.strcmp(AV31Opcoes, "")==0) ? "" : ", ") + httpContext.getMessage( "envio por e-mail", "") ;
      }
      if ( GXutil.strcmp(AV16MANAUT, httpContext.getMessage( "S", "")) == 0 )
      {
         AV31Opcoes += ((GXutil.strcmp(AV31Opcoes, "")==0) ? "" : ", ") + httpContext.getMessage( "modo manual", "") ;
      }
      if ( GXutil.strcmp(AV17OPI, httpContext.getMessage( "S", "")) == 0 )
      {
         AV31Opcoes += ((GXutil.strcmp(AV31Opcoes, "")==0) ? "" : ", ") + httpContext.getMessage( "OPI habilitado", "") ;
      }
      if ( GXutil.strcmp(AV31Opcoes, "") != 0 )
      {
         AV26Texto += AV30Sep + httpContext.getMessage( "Opções ativas: ", "") + AV31Opcoes ;
         AV30Sep = ". " ;
      }
      if ( GXutil.strcmp(GXutil.trim( AV25LISTPRINTER), "") != 0 )
      {
         AV26Texto += AV30Sep + httpContext.getMessage( "Impressão na ", "") + GXutil.trim( AV25LISTPRINTER) ;
         AV30Sep = ". " ;
      }
      AV26Texto += "." ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = getfacturainfo.this.AV26Texto;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV26Texto = "" ;
      AV30Sep = "" ;
      AV14VERSUMLIN = "" ;
      AV15MAIL = "" ;
      AV16MANAUT = "" ;
      AV17OPI = "" ;
      AV25LISTPRINTER = "" ;
      scmdbuf = "" ;
      P0APC2_A14423JobId = new java.util.UUID[] {java.util.UUID.fromString("00000000-0000-0000-0000-000000000000")} ;
      P0APC2_A14478ParKey = new String[] {""} ;
      P0APC2_A14479ParVal = new String[] {""} ;
      P0APC2_n14479ParVal = new boolean[] {false} ;
      P0APC2_A14480ValTyp = new String[] {""} ;
      P0APC2_n14480ValTyp = new boolean[] {false} ;
      A14423JobId = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      A14478ParKey = "" ;
      A14479ParVal = "" ;
      A14480ValTyp = "" ;
      AV18Key = "" ;
      AV19Val = "" ;
      AV20Typ = "" ;
      AV27FACFCHFROM = "" ;
      AV28FACFCHTO = "" ;
      AV33Filtros = "" ;
      AV29Saida = "" ;
      AV31Opcoes = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.getfacturainfo__default(),
         new Object[] {
             new Object[] {
            P0APC2_A14423JobId, P0APC2_A14478ParKey, P0APC2_A14479ParVal, P0APC2_n14479ParVal, P0APC2_A14480ValTyp, P0APC2_n14480ValTyp
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV9FACCODTO ;
   private short AV11COPIAS2 ;
   private short AV12F_HEADER ;
   private short AV13AGR_FASES ;
   private short Gx_err ;
   private int AV8FACCODFROM ;
   private int AV10CLICODFROM ;
   private int AV32CLICODTO ;
   private String AV26Texto ;
   private String scmdbuf ;
   private boolean n14479ParVal ;
   private boolean n14480ValTyp ;
   private String AV30Sep ;
   private String AV14VERSUMLIN ;
   private String AV15MAIL ;
   private String AV16MANAUT ;
   private String AV17OPI ;
   private String AV25LISTPRINTER ;
   private String A14478ParKey ;
   private String A14479ParVal ;
   private String A14480ValTyp ;
   private String AV18Key ;
   private String AV19Val ;
   private String AV20Typ ;
   private String AV27FACFCHFROM ;
   private String AV28FACFCHTO ;
   private String AV33Filtros ;
   private String AV29Saida ;
   private String AV31Opcoes ;
   private java.util.UUID AV24JobId ;
   private java.util.UUID A14423JobId ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private java.util.UUID[] P0APC2_A14423JobId ;
   private String[] P0APC2_A14478ParKey ;
   private String[] P0APC2_A14479ParVal ;
   private boolean[] P0APC2_n14479ParVal ;
   private String[] P0APC2_A14480ValTyp ;
   private boolean[] P0APC2_n14480ValTyp ;
}

final  class getfacturainfo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0APC2", "SELECT JobId, ParKey, ParVal, ValTyp FROM TXPJOBPAR WHERE JobId = ? ORDER BY JobId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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

