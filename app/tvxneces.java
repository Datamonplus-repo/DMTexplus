package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tvxneces", "/app.tvxneces"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tvxneces extends GXWebObjectStub
{
   public tvxneces( )
   {
   }

   public tvxneces( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tvxneces.class ));
   }

   public tvxneces( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tvxneces_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tvxneces_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tablas NECES y NECMOV";
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

