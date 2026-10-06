package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tseccioww", "/app.ficherosbasicos.tseccioww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tseccioww extends GXWebObjectStub
{
   public tseccioww( )
   {
   }

   public tseccioww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tseccioww.class ));
   }

   public tseccioww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tseccioww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tseccioww_impl(context).cleanup();
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

