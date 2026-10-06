package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmetpi3", "/app.tmetpi3"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmetpi3 extends GXWebObjectStub
{
   public tmetpi3( )
   {
   }

   public tmetpi3( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmetpi3.class ));
   }

   public tmetpi3( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmetpi3_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmetpi3_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Defectos de piezas";
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

