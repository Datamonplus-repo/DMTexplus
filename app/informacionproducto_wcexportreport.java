package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.informacionproducto_wcexportreport", "/app.informacionproducto_wcexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class informacionproducto_wcexportreport extends GXWebObjectStub
{
   public informacionproducto_wcexportreport( )
   {
   }

   public informacionproducto_wcexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( informacionproducto_wcexportreport.class ));
   }

   public informacionproducto_wcexportreport( int remoteHandle ,
                                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new informacionproducto_wcexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new informacionproducto_wcexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informacion Producto_WCExport Report";
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

