package app.balance ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class get_maquinaintroduzida extends GXProcedure
{
   public get_maquinaintroduzida( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( get_maquinaintroduzida.class ), "" );
   }

   public get_maquinaintroduzida( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             int aP3 ,
                             String aP4 ,
                             String aP5 ,
                             String aP6 )
   {
      get_maquinaintroduzida.this.aP7 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        int aP3 ,
                        String aP4 ,
                        String aP5 ,
                        String aP6 ,
                        String[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             int aP3 ,
                             String aP4 ,
                             String aP5 ,
                             String aP6 ,
                             String[] aP7 )
   {
      get_maquinaintroduzida.this.AV12Maquina = aP0;
      get_maquinaintroduzida.this.AV13DescricaoMaquina = aP1;
      get_maquinaintroduzida.this.AV15Operario = aP2;
      get_maquinaintroduzida.this.AV16OrdemServico = aP3;
      get_maquinaintroduzida.this.AV14Fase = aP4;
      get_maquinaintroduzida.this.AV17Par = aP5;
      get_maquinaintroduzida.this.AV9Situacao = aP6;
      get_maquinaintroduzida.this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8HTML = "" ;
      AV8HTML += httpContext.getMessage( "<div style=\"", "") ;
      AV8HTML += httpContext.getMessage( "width:100%;", "") ;
      AV8HTML += httpContext.getMessage( "font-family:Arial,Helvetica,sans-serif;", "") ;
      AV8HTML += httpContext.getMessage( "font-size:12px;", "") ;
      AV8HTML += httpContext.getMessage( "color:#263238;", "") ;
      AV8HTML += httpContext.getMessage( "background:transparent;", "") ;
      AV8HTML += "\">" ;
      AV8HTML += httpContext.getMessage( "<div style=\"", "") ;
      AV8HTML += httpContext.getMessage( "display:flex;", "") ;
      AV8HTML += httpContext.getMessage( "align-items:center;", "") ;
      AV8HTML += httpContext.getMessage( "justify-content:space-between;", "") ;
      AV8HTML += httpContext.getMessage( "padding:9px 12px;", "") ;
      AV8HTML += httpContext.getMessage( "margin-bottom:8px;", "") ;
      AV8HTML += httpContext.getMessage( "border-bottom:1px solid #dce2e6;", "") ;
      AV8HTML += "\">" ;
      AV8HTML += httpContext.getMessage( "<div style=\"", "") ;
      AV8HTML += httpContext.getMessage( "font-size:14px;", "") ;
      AV8HTML += httpContext.getMessage( "font-weight:bold;", "") ;
      AV8HTML += httpContext.getMessage( "color:#344b5b;", "") ;
      AV8HTML += "\">" ;
      AV8HTML += httpContext.getMessage( "Informação Máquina Introduzida", "") ;
      AV8HTML += httpContext.getMessage( "</div>", "") ;
      AV8HTML += httpContext.getMessage( "</div>", "") ;
      AV8HTML += httpContext.getMessage( "<table style=\"", "") ;
      AV8HTML += httpContext.getMessage( "width:100%;", "") ;
      AV8HTML += httpContext.getMessage( "border-collapse:collapse;", "") ;
      AV8HTML += "\">" ;
      AV8HTML += httpContext.getMessage( "<tr>", "") ;
      AV8HTML += httpContext.getMessage( "<td style=\"", "") ;
      AV8HTML += httpContext.getMessage( "width:72%;", "") ;
      AV8HTML += httpContext.getMessage( "vertical-align:top;", "") ;
      AV8HTML += httpContext.getMessage( "padding-right:14px;", "") ;
      AV8HTML += "\">" ;
      AV8HTML += httpContext.getMessage( "<div style=\"", "") ;
      AV8HTML += httpContext.getMessage( "display:flex;", "") ;
      AV8HTML += httpContext.getMessage( "align-items:center;", "") ;
      AV8HTML += httpContext.getMessage( "margin-bottom:7px;", "") ;
      AV8HTML += "\">" ;
      AV8HTML += httpContext.getMessage( "<div style=\"", "") ;
      AV8HTML += httpContext.getMessage( "width:90px;", "") ;
      AV8HTML += httpContext.getMessage( "font-size:11px;", "") ;
      AV8HTML += httpContext.getMessage( "font-weight:bold;", "") ;
      AV8HTML += httpContext.getMessage( "color:#60727e;", "") ;
      AV8HTML += httpContext.getMessage( "\">Máquina</div>", "") ;
      AV8HTML += httpContext.getMessage( "<div style=\"", "") ;
      AV8HTML += httpContext.getMessage( "width:90px;", "") ;
      AV8HTML += httpContext.getMessage( "padding:6px 8px;", "") ;
      AV8HTML += httpContext.getMessage( "border:1px solid #cfd8dc;", "") ;
      AV8HTML += httpContext.getMessage( "border-radius:4px;", "") ;
      AV8HTML += httpContext.getMessage( "background:#ffffff;", "") ;
      AV8HTML += httpContext.getMessage( "font-weight:bold;", "") ;
      AV8HTML += "\">" ;
      AV8HTML += GXutil.trim( AV12Maquina) ;
      AV8HTML += httpContext.getMessage( "</div>", "") ;
      AV8HTML += httpContext.getMessage( "<div style=\"", "") ;
      AV8HTML += httpContext.getMessage( "margin-left:5px;", "") ;
      AV8HTML += httpContext.getMessage( "flex:1;", "") ;
      AV8HTML += httpContext.getMessage( "padding:6px 8px;", "") ;
      AV8HTML += httpContext.getMessage( "border:1px solid #cfd8dc;", "") ;
      AV8HTML += httpContext.getMessage( "border-radius:4px;", "") ;
      AV8HTML += httpContext.getMessage( "background:#ffffff;", "") ;
      AV8HTML += "\">" ;
      AV8HTML += GXutil.trim( AV13DescricaoMaquina) ;
      AV8HTML += httpContext.getMessage( "</div>", "") ;
      AV8HTML += httpContext.getMessage( "</div>", "") ;
      AV8HTML += httpContext.getMessage( "<div style=\"", "") ;
      AV8HTML += httpContext.getMessage( "display:flex;", "") ;
      AV8HTML += httpContext.getMessage( "align-items:center;", "") ;
      AV8HTML += httpContext.getMessage( "margin-bottom:7px;", "") ;
      AV8HTML += "\">" ;
      AV8HTML += httpContext.getMessage( "<div style=\"", "") ;
      AV8HTML += httpContext.getMessage( "width:90px;", "") ;
      AV8HTML += httpContext.getMessage( "font-size:11px;", "") ;
      AV8HTML += httpContext.getMessage( "font-weight:bold;", "") ;
      AV8HTML += httpContext.getMessage( "color:#60727e;", "") ;
      AV8HTML += httpContext.getMessage( "\">Operário</div>", "") ;
      AV8HTML += httpContext.getMessage( "<div style=\"", "") ;
      AV8HTML += httpContext.getMessage( "flex:1;", "") ;
      AV8HTML += httpContext.getMessage( "padding:6px 8px;", "") ;
      AV8HTML += httpContext.getMessage( "border:1px solid #cfd8dc;", "") ;
      AV8HTML += httpContext.getMessage( "border-radius:4px;", "") ;
      AV8HTML += httpContext.getMessage( "background:#ffffff;", "") ;
      AV8HTML += "\">" ;
      AV8HTML += GXutil.trim( AV15Operario) ;
      AV8HTML += httpContext.getMessage( "</div>", "") ;
      AV8HTML += httpContext.getMessage( "</div>", "") ;
      AV8HTML += httpContext.getMessage( "<div style=\"", "") ;
      AV8HTML += httpContext.getMessage( "display:flex;", "") ;
      AV8HTML += httpContext.getMessage( "align-items:center;", "") ;
      AV8HTML += httpContext.getMessage( "margin-bottom:7px;", "") ;
      AV8HTML += "\">" ;
      AV8HTML += httpContext.getMessage( "<div style=\"", "") ;
      AV8HTML += httpContext.getMessage( "width:90px;", "") ;
      AV8HTML += httpContext.getMessage( "font-size:11px;", "") ;
      AV8HTML += httpContext.getMessage( "font-weight:bold;", "") ;
      AV8HTML += httpContext.getMessage( "color:#60727e;", "") ;
      AV8HTML += httpContext.getMessage( "\">Ordem Serviço</div>", "") ;
      AV8HTML += httpContext.getMessage( "<div style=\"", "") ;
      AV8HTML += httpContext.getMessage( "width:90px;", "") ;
      AV8HTML += httpContext.getMessage( "padding:6px 8px;", "") ;
      AV8HTML += httpContext.getMessage( "border:1px solid #cfd8dc;", "") ;
      AV8HTML += httpContext.getMessage( "border-radius:4px;", "") ;
      AV8HTML += httpContext.getMessage( "background:#ffffff;", "") ;
      AV8HTML += httpContext.getMessage( "text-align:center;", "") ;
      AV8HTML += httpContext.getMessage( "font-weight:bold;", "") ;
      AV8HTML += "\">" ;
      AV8HTML += GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV16OrdemServico), "ZZZZZZZ9")) ;
      AV8HTML += httpContext.getMessage( "</div>", "") ;
      AV8HTML += httpContext.getMessage( "</div>", "") ;
      AV8HTML += httpContext.getMessage( "<div style=\"", "") ;
      AV8HTML += httpContext.getMessage( "display:flex;", "") ;
      AV8HTML += httpContext.getMessage( "align-items:center;", "") ;
      AV8HTML += httpContext.getMessage( "margin-bottom:7px;", "") ;
      AV8HTML += "\">" ;
      AV8HTML += httpContext.getMessage( "<div style=\"", "") ;
      AV8HTML += httpContext.getMessage( "width:90px;", "") ;
      AV8HTML += httpContext.getMessage( "font-size:11px;", "") ;
      AV8HTML += httpContext.getMessage( "font-weight:bold;", "") ;
      AV8HTML += httpContext.getMessage( "color:#60727e;", "") ;
      AV8HTML += httpContext.getMessage( "\">Fase</div>", "") ;
      AV8HTML += httpContext.getMessage( "<div style=\"", "") ;
      AV8HTML += httpContext.getMessage( "flex:1;", "") ;
      AV8HTML += httpContext.getMessage( "padding:6px 8px;", "") ;
      AV8HTML += httpContext.getMessage( "border:1px solid #cfd8dc;", "") ;
      AV8HTML += httpContext.getMessage( "border-radius:4px;", "") ;
      AV8HTML += httpContext.getMessage( "background:#ffffff;", "") ;
      AV8HTML += "\">" ;
      AV8HTML += GXutil.trim( AV14Fase) ;
      AV8HTML += httpContext.getMessage( "</div>", "") ;
      AV8HTML += httpContext.getMessage( "</div>", "") ;
      AV8HTML += httpContext.getMessage( "<div style=\"", "") ;
      AV8HTML += httpContext.getMessage( "display:flex;", "") ;
      AV8HTML += httpContext.getMessage( "align-items:center;", "") ;
      AV8HTML += "\">" ;
      AV8HTML += httpContext.getMessage( "<div style=\"", "") ;
      AV8HTML += httpContext.getMessage( "width:90px;", "") ;
      AV8HTML += httpContext.getMessage( "font-size:11px;", "") ;
      AV8HTML += httpContext.getMessage( "font-weight:bold;", "") ;
      AV8HTML += httpContext.getMessage( "color:#60727e;", "") ;
      AV8HTML += httpContext.getMessage( "\">Par.</div>", "") ;
      AV8HTML += httpContext.getMessage( "<div style=\"", "") ;
      AV8HTML += httpContext.getMessage( "flex:1;", "") ;
      AV8HTML += httpContext.getMessage( "padding:6px 8px;", "") ;
      AV8HTML += httpContext.getMessage( "border:1px solid #cfd8dc;", "") ;
      AV8HTML += httpContext.getMessage( "border-radius:4px;", "") ;
      AV8HTML += httpContext.getMessage( "background:#ffffff;", "") ;
      AV8HTML += "\">" ;
      AV8HTML += GXutil.trim( AV17Par) ;
      AV8HTML += httpContext.getMessage( "</div>", "") ;
      AV8HTML += httpContext.getMessage( "</div>", "") ;
      AV8HTML += httpContext.getMessage( "</td>", "") ;
      AV8HTML += httpContext.getMessage( "<td style=\"", "") ;
      AV8HTML += httpContext.getMessage( "width:28%;", "") ;
      AV8HTML += httpContext.getMessage( "vertical-align:middle;", "") ;
      AV8HTML += httpContext.getMessage( "text-align:center;", "") ;
      AV8HTML += "\">" ;
      AV10CorSituacao = "#607d8b" ;
      AV11CorFundoSituacao = "#eceff1" ;
      if ( GXutil.strcmp(GXutil.upper( GXutil.trim( AV9Situacao)), httpContext.getMessage( "EN PROCESO", "")) == 0 )
      {
         AV10CorSituacao = "#00897b" ;
         AV11CorFundoSituacao = "#e0f2f1" ;
      }
      else
      {
         if ( GXutil.strcmp(GXutil.upper( GXutil.trim( AV9Situacao)), httpContext.getMessage( "PARADA", "")) == 0 )
         {
            AV10CorSituacao = "#e53935" ;
            AV11CorFundoSituacao = "#ffebee" ;
         }
         else
         {
            if ( GXutil.strcmp(GXutil.upper( GXutil.trim( AV9Situacao)), httpContext.getMessage( "AGUARDANDO", "")) == 0 )
            {
               AV10CorSituacao = "#f9a825" ;
               AV11CorFundoSituacao = "#fff8e1" ;
            }
            else
            {
               if ( GXutil.strcmp(GXutil.upper( GXutil.trim( AV9Situacao)), httpContext.getMessage( "FINALIZADA", "")) == 0 )
               {
                  AV10CorSituacao = "#3949ab" ;
                  AV11CorFundoSituacao = "#e8eaf6" ;
               }
            }
         }
      }
      AV8HTML += httpContext.getMessage( "<div style=\"", "") ;
      AV8HTML += httpContext.getMessage( "display:inline-flex;", "") ;
      AV8HTML += httpContext.getMessage( "align-items:center;", "") ;
      AV8HTML += httpContext.getMessage( "justify-content:center;", "") ;
      AV8HTML += httpContext.getMessage( "gap:8px;", "") ;
      AV8HTML += httpContext.getMessage( "padding:9px 13px;", "") ;
      AV8HTML += httpContext.getMessage( "border-radius:6px;", "") ;
      AV8HTML += httpContext.getMessage( "background:", "") + AV11CorFundoSituacao + ";" ;
      AV8HTML += httpContext.getMessage( "border:1px solid ", "") + AV10CorSituacao + ";" ;
      AV8HTML += httpContext.getMessage( "color:", "") + AV10CorSituacao + ";" ;
      AV8HTML += httpContext.getMessage( "font-size:12px;", "") ;
      AV8HTML += httpContext.getMessage( "font-weight:bold;", "") ;
      AV8HTML += "\">" ;
      if ( GXutil.strcmp(GXutil.upper( GXutil.trim( AV9Situacao)), httpContext.getMessage( "EN PROCESO", "")) == 0 )
      {
         AV8HTML += httpContext.getMessage( "<svg width=\"14\" height=\"14\" viewBox=\"0 0 14 14\" style=\"display:block;\">", "") ;
         AV8HTML += httpContext.getMessage( "<circle cx=\"7\" cy=\"7\" r=\"4\" fill=\"", "") + AV10CorSituacao + "\">" ;
         AV8HTML += httpContext.getMessage( "<animate ", "") ;
         AV8HTML += httpContext.getMessage( "attributeName=\"r\" ", "") ;
         AV8HTML += httpContext.getMessage( "values=\"3;5;3\" ", "") ;
         AV8HTML += httpContext.getMessage( "dur=\"1.2s\" ", "") ;
         AV8HTML += httpContext.getMessage( "repeatCount=\"indefinite\" />", "") ;
         AV8HTML += httpContext.getMessage( "<animate ", "") ;
         AV8HTML += httpContext.getMessage( "attributeName=\"opacity\" ", "") ;
         AV8HTML += httpContext.getMessage( "values=\"1;.35;1\" ", "") ;
         AV8HTML += httpContext.getMessage( "dur=\"1.2s\" ", "") ;
         AV8HTML += httpContext.getMessage( "repeatCount=\"indefinite\" />", "") ;
         AV8HTML += httpContext.getMessage( "</circle>", "") ;
         AV8HTML += httpContext.getMessage( "</svg>", "") ;
      }
      else
      {
         AV8HTML += httpContext.getMessage( "<span style=\"", "") ;
         AV8HTML += httpContext.getMessage( "display:inline-block;", "") ;
         AV8HTML += httpContext.getMessage( "width:9px;", "") ;
         AV8HTML += httpContext.getMessage( "height:9px;", "") ;
         AV8HTML += httpContext.getMessage( "border-radius:50%;", "") ;
         AV8HTML += httpContext.getMessage( "background:", "") + AV10CorSituacao + ";" ;
         AV8HTML += httpContext.getMessage( "\"></span>", "") ;
      }
      AV8HTML += httpContext.getMessage( "<span>", "") ;
      AV8HTML += GXutil.trim( AV9Situacao) ;
      AV8HTML += httpContext.getMessage( "</span>", "") ;
      AV8HTML += httpContext.getMessage( "</div>", "") ;
      AV8HTML += httpContext.getMessage( "</td>", "") ;
      AV8HTML += httpContext.getMessage( "</tr>", "") ;
      AV8HTML += httpContext.getMessage( "</table>", "") ;
      AV8HTML += httpContext.getMessage( "</div>", "") ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP7[0] = get_maquinaintroduzida.this.AV8HTML;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8HTML = "" ;
      AV10CorSituacao = "" ;
      AV11CorFundoSituacao = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV16OrdemServico ;
   private String AV8HTML ;
   private String AV12Maquina ;
   private String AV13DescricaoMaquina ;
   private String AV15Operario ;
   private String AV14Fase ;
   private String AV17Par ;
   private String AV9Situacao ;
   private String AV10CorSituacao ;
   private String AV11CorFundoSituacao ;
   private String[] aP7 ;
}

