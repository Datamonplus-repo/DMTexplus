package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.consultadeproduccion_fasesexportreport", "/app.consultadeproduccion_fasesexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class consultadeproduccion_fasesexportreport extends GXWebObjectStub
{
   public consultadeproduccion_fasesexportreport( )
   {
   }

   public consultadeproduccion_fasesexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( consultadeproduccion_fasesexportreport.class ));
   }

   public consultadeproduccion_fasesexportreport( int remoteHandle ,
                                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new consultadeproduccion_fasesexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new consultadeproduccion_fasesexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe de Consulta Producción por Fase";
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

