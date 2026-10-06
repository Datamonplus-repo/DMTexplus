package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.consultadeproduccion_fasesfullexportreport", "/app.consultadeproduccion_fasesfullexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class consultadeproduccion_fasesfullexportreport extends GXWebObjectStub
{
   public consultadeproduccion_fasesfullexportreport( )
   {
   }

   public consultadeproduccion_fasesfullexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( consultadeproduccion_fasesfullexportreport.class ));
   }

   public consultadeproduccion_fasesfullexportreport( int remoteHandle ,
                                                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new consultadeproduccion_fasesfullexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new consultadeproduccion_fasesfullexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Consulta Producción por Cliente";
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

