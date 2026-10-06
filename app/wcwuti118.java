package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcwuti118", "/app.wcwuti118"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcwuti118 extends GXWebObjectStub
{
   public wcwuti118( )
   {
   }

   public wcwuti118( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcwuti118.class ));
   }

   public wcwuti118( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcwuti118_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcwuti118_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Analisis Consumos, Compras, Stock Final";
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

