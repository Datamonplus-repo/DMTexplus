package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.gestionlaboratorio.consultasituacioncoleccion_wcexportcsv", "/app.gestionlaboratorio.consultasituacioncoleccion_wcexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class consultasituacioncoleccion_wcexportcsv extends GXWebObjectStub
{
   public consultasituacioncoleccion_wcexportcsv( )
   {
   }

   public consultasituacioncoleccion_wcexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( consultasituacioncoleccion_wcexportcsv.class ));
   }

   public consultasituacioncoleccion_wcexportcsv( int remoteHandle ,
                                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new consultasituacioncoleccion_wcexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new consultasituacioncoleccion_wcexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Consulta Situacion Coleccion_WCExport CSV";
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

