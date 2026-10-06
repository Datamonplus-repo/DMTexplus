package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tartas", "/app.tartas"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tartas extends GXWebObjectStub
{
   public tartas( )
   {
   }

   public tartas( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tartas.class ));
   }

   public tartas( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tartas_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tartas_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "ARTICULOS AS400";
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

