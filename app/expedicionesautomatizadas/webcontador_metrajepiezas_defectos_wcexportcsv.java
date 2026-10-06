package app.expedicionesautomatizadas ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.expedicionesautomatizadas.webcontador_metrajepiezas_defectos_wcexportcsv", "/app.expedicionesautomatizadas.webcontador_metrajepiezas_defectos_wcexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webcontador_metrajepiezas_defectos_wcexportcsv extends GXWebObjectStub
{
   public webcontador_metrajepiezas_defectos_wcexportcsv( )
   {
   }

   public webcontador_metrajepiezas_defectos_wcexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webcontador_metrajepiezas_defectos_wcexportcsv.class ));
   }

   public webcontador_metrajepiezas_defectos_wcexportcsv( int remoteHandle ,
                                                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webcontador_metrajepiezas_defectos_wcexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webcontador_metrajepiezas_defectos_wcexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Web Contador_Metraje Piezas_Defectos_WCExport CSV";
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

