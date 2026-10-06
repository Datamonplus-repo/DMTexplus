package app.core ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.core.diferenciarecuentocsv", "/app.core.diferenciarecuentocsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class diferenciarecuentocsv extends GXWebObjectStub
{
   public diferenciarecuentocsv( )
   {
   }

   public diferenciarecuentocsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( diferenciarecuentocsv.class ));
   }

   public diferenciarecuentocsv( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new diferenciarecuentocsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new diferenciarecuentocsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Diferencia Recuento Csv";
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

