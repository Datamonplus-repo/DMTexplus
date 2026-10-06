package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttrn22", "/app.ttrn22"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttrn22 extends GXWebObjectStub
{
   public ttrn22( )
   {
   }

   public ttrn22( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttrn22.class ));
   }

   public ttrn22( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttrn22_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttrn22_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Entrada Tejido Crudo Almacen";
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

