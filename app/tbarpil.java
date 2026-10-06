package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tbarpil", "/app.tbarpil"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tbarpil extends GXWebObjectStub
{
   public tbarpil( )
   {
   }

   public tbarpil( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tbarpil.class ));
   }

   public tbarpil( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tbarpil_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tbarpil_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "MANTENIMIENTO PIEZAS LAVANDERIAS";
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

