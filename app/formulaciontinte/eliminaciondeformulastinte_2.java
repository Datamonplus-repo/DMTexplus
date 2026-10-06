package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.eliminaciondeformulastinte_2", "/app.formulaciontinte.eliminaciondeformulastinte_2"})
@jakarta.servlet.annotation.MultipartConfig
public final  class eliminaciondeformulastinte_2 extends GXWebObjectStub
{
   public eliminaciondeformulastinte_2( )
   {
   }

   public eliminaciondeformulastinte_2( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( eliminaciondeformulastinte_2.class ));
   }

   public eliminaciondeformulastinte_2( int remoteHandle ,
                                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new eliminaciondeformulastinte_2_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new eliminaciondeformulastinte_2_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Mto Formulas Tinte";
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

