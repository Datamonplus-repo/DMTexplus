package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.tfrasrww", "/app.stocksquimicos.tfrasrww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tfrasrww extends GXWebObjectStub
{
   public tfrasrww( )
   {
   }

   public tfrasrww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tfrasrww.class ));
   }

   public tfrasrww( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tfrasrww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tfrasrww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tipos Frases Riesgo";
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

