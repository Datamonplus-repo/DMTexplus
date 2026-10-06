package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttrn24", "/app.ttrn24"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttrn24 extends GXWebObjectStub
{
   public ttrn24( )
   {
   }

   public ttrn24( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttrn24.class ));
   }

   public ttrn24( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttrn24_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttrn24_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Pruebas CMETPI/LMETPI/METPID";
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

