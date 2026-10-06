package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tseccio", "/app.ficherosbasicos.tseccio"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tseccio extends GXWebObjectStub
{
   public tseccio( )
   {
   }

   public tseccio( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tseccio.class ));
   }

   public tseccio( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tseccio_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tseccio_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Secciones";
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

