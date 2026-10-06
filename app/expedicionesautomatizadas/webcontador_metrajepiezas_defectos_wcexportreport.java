package app.expedicionesautomatizadas ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.expedicionesautomatizadas.webcontador_metrajepiezas_defectos_wcexportreport", "/app.expedicionesautomatizadas.webcontador_metrajepiezas_defectos_wcexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webcontador_metrajepiezas_defectos_wcexportreport extends GXWebObjectStub
{
   public webcontador_metrajepiezas_defectos_wcexportreport( )
   {
   }

   public webcontador_metrajepiezas_defectos_wcexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webcontador_metrajepiezas_defectos_wcexportreport.class ));
   }

   public webcontador_metrajepiezas_defectos_wcexportreport( int remoteHandle ,
                                                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webcontador_metrajepiezas_defectos_wcexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webcontador_metrajepiezas_defectos_wcexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Web Contador_Metraje Piezas_Defectos_WCExport Report";
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

}

