package app.albaranescomerciales ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.albaranescomerciales.preparoxmlalbarancomercialat", "/app.albaranescomerciales.preparoxmlalbarancomercialat"})
@jakarta.servlet.annotation.MultipartConfig
public final  class preparoxmlalbarancomercialat extends GXWebObjectStub
{
   public preparoxmlalbarancomercialat( )
   {
   }

   public preparoxmlalbarancomercialat( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( preparoxmlalbarancomercialat.class ));
   }

   public preparoxmlalbarancomercialat( int remoteHandle ,
                                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new preparoxmlalbarancomercialat_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new preparoxmlalbarancomercialat_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Preparo XML Albaran Comercial AT";
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

