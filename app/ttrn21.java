package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttrn21", "/app.ttrn21"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttrn21 extends GXWebObjectStub
{
   public ttrn21( )
   {
   }

   public ttrn21( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttrn21.class ));
   }

   public ttrn21( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttrn21_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttrn21_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Mantenimiento Formulas Estampacion (PASTAS)";
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

